import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VoitureCucumberTest {
    private Voiture voiture = new Voiture("Mercedes", "rouge");
    private Chassis chassis;
    private ArrayList<Roue> roueList = new ArrayList<>();

    @Given("le client crée {int} roues de poids {int}, un chassis de poids {int}")
    public void leClientCreeDesRouesEtUnChassis(int nbRoues, int poidsRoue, int poidsChassis) {
        chassis = new Chassis(poidsChassis);
        for (int i = 0; i < nbRoues; i++) {
            roueList.add(new Roue(20, poidsRoue));
        }
    }

    @When("le client applique les éléments à la voiture")
    public void leClientAppliqueLesElementsALaVoiture() {
        voiture.setRoues(roueList);
        voiture.setChassis(chassis);
    }

    @Then("Le poids de la voiture vaut {int}")
    public void verificationDuPoidsDeLaVoiture(int poidsVoiture) {
        assertEquals(poidsVoiture, voiture.getPoids());
    }

    @Given("le client a une voiture à {int} roues de poids {int}")
    public void leClientAUneVoitureAvecDesRoues(int nbRoues, int poidsRoue) {
        Chassis chassis = new Chassis(0);
        voiture.setChassis(chassis);
        roueList = new ArrayList<>();
        for (int i = 0; i < nbRoues; i++) {
            roueList.add(new Roue(20, poidsRoue));
        }
        voiture.setRoues(roueList);
    }

    @When("le client remplace une roue de sa voiture par une nouvelle de poids {int}")
    public void leClientRemplaceUneRoue(int poidsRoue) {
        Roue roueCassee = voiture.getRoues().get(0);
        voiture.removeRoue(roueCassee);
        Roue roueNeuve = new Roue(20, poidsRoue);
        voiture.addRoue(roueNeuve);
    }

    @Then("la voiture a toujours {int} roues")
    public void laVoitureAToujoursAutantDeRoues(int nbRoues) {
        assertEquals(nbRoues, voiture.getRoues().size());
    }

    @And("le poids de la voiture est mis à jour au poids {int}")
    public void lePoidsDeLaVoitureEstMisAJour(int poidsFinal) {
        assertEquals(poidsFinal, voiture.getPoids());
    }
}