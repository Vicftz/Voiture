import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Rule;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RoueCucumberTest {
    private Voiture voiture;
    List<Roue> list = new ArrayList<>();

    @Given("le client crée {int} roue et souhaite les associer à une voiture existance")
    public void leClientCreeDesRoues(int nbRoue) {
        voiture = new Voiture("Mercedes", "Rouge");
        for(int i=0; i<nbRoue; i++){
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
    public void laVoiturePossèdeDesRoues(int nbRoue) {
        assertEquals(nbRoue, voiture.getRoues().size());
    }


}
