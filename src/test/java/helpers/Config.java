package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Config {

    public static WebDriver driver;
    public static void attente(int s){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
    }

    public static void waitForElementToBeVisible(WebDriver driver, WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }
    public static void waitForVisibilityOfAllElements(WebDriver driver, List<WebElement> locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElements(locator));
    }
}
