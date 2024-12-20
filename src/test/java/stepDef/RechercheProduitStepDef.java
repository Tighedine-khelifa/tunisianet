package stepDef;

import helpers.Config;
import helpers.Utils;
import io.cucumber.java.en.*;

import objectsPages.RechercheProduitPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class RechercheProduitStepDef {
    RechercheProduitPage rechercheProduitPage;
    @Given("L'utilisateur est sur la page d accueil tunisianet")
    public void l_utilisateur_est_sur_la_page_d_accueil_tunisianet() throws Exception {
        Config.driver = new ChromeDriver();
        Config.driver.manage().window().maximize();
        Config.attente(10);
        Config.driver.get(Utils.getProperties("urlAccueil"));

        rechercheProduitPage = new RechercheProduitPage();
    }
    @When("L'utilisateur recherche le produit {string}")
    public void l_utilisateur_recherche_le_produit(String product) {
        rechercheProduitPage.setTxtRecherche(product);
        rechercheProduitPage.clickBtnRecherche();

    }
    @Then("L'utilisateur est clique sur le bouton le loup de recherche")
    public void l_utilisateur_est_clique_sur_le_bouton_le_loup_de_recherche() {
        rechercheProduitPage.verifPageRechercheProduct();

    }
}
