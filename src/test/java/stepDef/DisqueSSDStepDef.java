package stepDef;

import helpers.Config;
import helpers.Utils;
import io.cucumber.java.en.*;

import objectsPages.DisqueSSDPage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisqueSSDStepDef {
    DisqueSSDPage disqueSSDPage;
    @Given("L utilisateur est sur la page disque ssd")
    public void l_utilisateur_est_sur_la_page_disque_ssd() throws Exception {
        Config.driver = new ChromeDriver();
        Config.driver.manage().window().maximize();
        Config.attente(6);
        Config.driver.get(Utils.getProperties("urlSSD"));

        disqueSSDPage = new DisqueSSDPage();
    }
    @When("L utilisateur verifier que le produit{string} est valable")
    public void l_utilisateur_verifier_que_le_produit_est_valable(String  expected) {
        disqueSSDPage.clickLinkProducts(expected);
        Config.attente(20);
        Assert.assertEquals(expected,disqueSSDPage.verifProductsDisqueIntern());

    }
    @When("L utilisateur commande le produit")
    public void l_utilisateur_commande_le_produit() {
        Config.attente(3);
        disqueSSDPage.clickBtnAjoutAuPanier();

    }
    @Then("L'utilisateur verifier que la commande de{string} est effectuer")
    public void l_utilisateur_verifier_que_la_commande_est_effectuer(String expected) {
        Assert.assertEquals(expected,disqueSSDPage.getVrifProduct());
    }
}
