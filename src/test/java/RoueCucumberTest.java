import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RoueCucumberTest {
    private Voiture voiture;
    List<Roue> list = new ArrayList<>();

    @Given("le client crée {int} roues et souhaite les associer à une voiture existante")
    public void leClientCreeDesRoues(int nbRoues) {
        voiture = new Voiture("Mercedes", "Rouge");
        for (int i = 0; i < nbRoues; i++) {
            list.add(new Roue());
        }
    }

    @When("le client applique les roues à la voiture")
    public void leClientAppliqueLesRouesALaVoiture() {
        for (Roue roue : list) {
            voiture.addRoue(roue);
        }
    }

    @Then("La voiture possède {int} roues")
    public void laVoiturePossedeDesRoues(int nbRoue) {
        assertEquals(nbRoue, voiture.getRoues().size());
    }
}