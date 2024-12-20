package stepDef;

import helpers.Config;
import helpers.Utils;
import io.cucumber.java.en.*;
import objectsPages.AccueilPage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccueilStepDef {
    AccueilPage accueilPage;
    @Given("L utilisateur est sur la page d accueil de tunisianet")
    public void l_utilisateur_est_sur_la_page_d_accueil_de_tunisianet() throws Exception {
        Config.driver = new ChromeDriver();
        Config.driver.manage().window().maximize();
        Config.attente(10);
        Config.driver.get(Utils.getProperties("urlAccueil"));

        accueilPage = new AccueilPage();

    }
    @When("L utilisateur survole la soure sur le menu de la page d accueil")
    public void l_utilisateur_survole_la_soure_sur_le_menu_de_la_page_d_accueil() {
         accueilPage.clickMenus("Stockage");
    }
    @When("l utilisateur clique sur submenu")
    public void l_utilisateur_clique_sur_submenu() {
          Config.attente(4);
          accueilPage.clickSubMenusSSD("Disque");
    }
    @Then("L'utilisateur est redirige vers la page submenu")
    public void l_utilisateur_est_redirige_vers_la_page_submenu() {
        Config.attente(10);
        Assert.assertEquals("Disque SSD",accueilPage.getVerifTxtSSD());
        Config.driver.quit();

    }
}
