import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RoueCucumberTest {
    private VoitureTransformers voitureTransformers;
    List<Roue> list = new ArrayList<>();

    @Given("le client crée {int} roues et souhaite les associer à une voitureTransformers existante")
    public void leClientCreeDesRoues(int nbRoues) {
        voitureTransformers = new VoitureTransformers("Mercedes", "Rouge");
        for (int i = 0; i < nbRoues; i++) {
            list.add(new Roue());
        }
    }

    @When("le client applique les roues à la voitureTransformers")
    public void leClientAppliqueLesRouesALaVoiture() {
        for (Roue roue : list) {
            voitureTransformers.addRoue(roue);
        }
    }

    @Then("La voitureTransformers possède {int} roues")
    public void laVoiturePossedeDesRoues(int nbRoue) {
        assertEquals(nbRoue, voitureTransformers.getRoues().size());
    }
}