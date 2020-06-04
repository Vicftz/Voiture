package voiture;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

public class VoitureCucumberTest {
    private final Voiture voiture = new Voiture("Mercedes", "rouge");
    private Chassis chassis;
    private final ArrayList<Roue> roueList = new ArrayList<>();
    private Engin v;

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
        Assert.assertEquals(poidsVoiture, voiture.getPoids());
    }

    @Given("un habitant normal")
    public void unHabitantNormal() {
        //create habitant
    }

    @When("il veut créer une voiture à l'aide de la factory")
    public void ilVeutCreerUneVoitureALAideDeLaFactory() {
        VoitureFactory vf = new VoitureFactory();
        v = vf.createVoiture("");
    }

    @Then("la voiture créée est de la classe attendue")
    public void laVoitureCreeeEstDeLaClasseAttendue() {
        Assert.assertEquals(Voiture.class, v.getClass());
    }
}