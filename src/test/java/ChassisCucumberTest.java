import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ChassisCucumberTest {
    private Chassis chassis;

    @Given("le client crée un nouveau chassis sans spécifier son poids")
    public void leClientCréeUnNouveauChassisSansSpécifierSonPoids() {
        chassis = new Chassis();
    }

    @When("le client applique au chassis un poids positif")
    public void leClientAppliqueAuChassisUnPoidsPositif() {
        chassis.setPoids(800);
    }

    @Then("le chassis est créé et son poids est enregistré avec celui indiqué en entrée")
    public void leChassisEstCrééEtSonPoidsEstEnregistréAvecCeluiIndiquéEnEntrée() {
        assertEquals(800, chassis.getPoids());
    }

    @When("le client applique au chassis un poids négatif")
    public void leClientAppliqueAuChassisUnPoidsNégatif() {
        chassis.setPoids(-500);
    }

    @Then("le chassis est créé et son poids est enregistré avec une valeur de {int}")
    public void leChassisEstCrééEtSonPoidsEstEnregistréAvecUneValeurDe(int arg0) {
        assertEquals(0, chassis.getPoids());
    }
}
