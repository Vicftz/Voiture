import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Rule;

import static org.junit.Assert.assertEquals;

public class RoueCucumberTest {
    private Roue roue;
    private Voiture voiture;
    @Before
    public void doSomethingBefore() {
        voiture = new Voiture("Mercedes", "Rouge");
    }

    @Given("le client crée une nouvelle roue et souhaite l'associer à une voiture existance")
    public void leClientCréeUneNouvelleRoueEtSouhaiteLAssocierÀUneVoitureExistance() {
        roue = new Roue();
    }

    @When("le client set la voiture à la roue")
    public void leClientSetLaVoitureÀLaRoue() {
        roue.setVoiture(voiture);
    }

    @Then("On peut accéder à la voiture à partir de la roue")
    public void onPeutAccéderÀLaVoitureÀPartirDeLaRoue() {
        assertEquals(voiture, roue.getVoiture());
    }

    @Given("Une voiture")
    public void UneVoiture() {
        voiture = new Voiture("Porsche", "verte");
    }

    @When("Le client ajoute 4 roues à la voiture")
    public void leClientAjoute4RouesÀLaVoiture() {
        for(int i=0; i<4; i++){
            voiture.addRoue(new Roue());
        }
    }

    @Then("La voiture possède 4 roues")
    public void laVoiturePossède4Roues() {
        assertEquals(voiture.getRoues().size(), 4);
    }
}
