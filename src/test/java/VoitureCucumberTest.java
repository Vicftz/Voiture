import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VoitureCucumberTest {
    private Voiture voiture = new Voiture("Mercedes", "rouge");
    private Chassis chassis;
    private ArrayList<Roue> roueList = new ArrayList<>();

    @Given("le client crée {int} roue de poids {int}, un chassis de poids {int}")
    public void leClientCréeUnNouveauChassisSansSpécifierSonPoids(int nbRoue, int poidsRoue, int poidsChassis) {
        chassis = new Chassis(poidsChassis);
        for (int i=0; i<nbRoue; i++){
            roueList.add(new Roue(20,poidsRoue));
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
}
