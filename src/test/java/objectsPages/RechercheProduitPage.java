package objectsPages;

import helpers.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RechercheProduitPage {

    @FindBy(xpath = "//input[@id='search_query_top']")
    WebElement txtRecherche;
    @FindBy(xpath = "//button[@name='submit_search']")
    WebElement btnRecherche;

    @FindBy(xpath = "//h4[normalize-space()='Veuillez nous excuser pour le désagrément.']")
    WebElement verifProduit;

    public RechercheProduitPage(){
        PageFactory.initElements(Config.driver,this);
    }
    public void setTxtRecherche(String product){
        txtRecherche.sendKeys(product);

    }
    public void clickBtnRecherche(){
        Config.waitForElementToBeVisible(Config.driver,btnRecherche);
        btnRecherche.submit();
    }
    public String verifPageRechercheProduct(){
        Config.attente(3);
        return verifProduit.getText();
    }

}
