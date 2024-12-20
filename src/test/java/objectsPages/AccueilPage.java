package objectsPages;

import helpers.Config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static helpers.Config.driver;

public class AccueilPage {

    //locator
    @FindBy(xpath = "//ul[@class='menu-content top-menu']/li")
    List<WebElement> linkMenus;

    @FindBy(xpath = "(//div[contains(@class,'wb-sub-center')])[3]//li//a")
    List<WebElement> linkSubMenusSSD;

    @FindBy(xpath = "(//span[normalize-space()='Disque SSD'])[1]")
    WebElement verifTxtSSD;
    public AccueilPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickMenus(String menus) {
        System.out.println(linkMenus.size());
        for (WebElement menu : linkMenus) {
            if (menu.getText().contains(menus)) {
                System.out.println(menu.getText());
                Actions actions = new Actions(driver);
                actions.moveToElement(menu).perform();
                return;
            }
        }
    }

    public void clickSubMenusSSD(String sbMenus) {
        System.out.println(linkSubMenusSSD.size());
      Config.waitForVisibilityOfAllElements(Config.driver,linkSubMenusSSD);

        for (WebElement sbMenuSSD:linkSubMenusSSD) {
            System.out.println(sbMenuSSD.getText());
            if (sbMenuSSD.getText().contains(sbMenus)) {
                System.out.println(sbMenuSSD.getText());
               Config.waitForElementToBeVisible(Config.driver,sbMenuSSD);
                sbMenuSSD.click();
                return;
            }
        }

    }
    public String getVerifTxtSSD(){
        return verifTxtSSD.getText();
    }


}