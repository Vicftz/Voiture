import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VoitureCucumberTest {
    private Voiture voiture = new Voiture("Mercedes", "rouge");
    private Chassis chassis;
    private ArrayList<Roue> roueList = new ArrayList<>();
    private VehiculeDestructeur v;

    @Given("le client crée {int} roues de poids {int}, un chassis de poids {int}")
    public void leClientCreeUnNouveauChassisSansSpecifierSonPoids(int nbRoues, int poidsRoue, int poidsChassis) {
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

    @Given("un habitant normal")
    public void unHabitantNormal() {
    }

    @When("il veut créer une voiture à l'aide de la factory")
    public void ilVeutCreerUneVoitureALAideDeLaFactory() {
        VoitureFactory vf = new VoitureFactory();
        v = vf.createVoiture("");
    }

    @Then("la voiture créée est de la classe attendue")
    public void laVoitureCreeeEstDeLaClasseAttendue() {
        assertEquals(Voiture.class, v.getClass());
    }
}