package voiture;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChassisCucumberTest {
    private Chassis chassis;

    @Given("le client crée un nouveau chassis sans spécifier son poids")
    public void leClientCreeUnNouveauChassisSansSpecifierSonPoids() {
        chassis = new Chassis();
    }

    @When("le client applique au chassis un {int} positif")
    public void leClientAppliqueAuChassisUnPoidsPositif(int poids) {
        chassis.setPoids(poids);
    }

    @Then("le chassis est créé et son {int} est celui indiqué en entrée")
    public void leChassisEstCreeEtSonPoidsEstCeluiIndiqueEnEntree(int poids) {
        Assert.assertEquals(poids, chassis.getPoids());
    }

    @When("le client applique au chassis un {int} négatif")
    public void leClientAppliqueAuChassisUnPoidsNegatif(int poids) {
        chassis.setPoids(poids);
    }

    @Then("le chassis est créé et son poids est enregistré avec une valeur de {int}")
    public void leChassisEstCreeEtSonPoidsEstEnregistreAvecUneValeurDeZero(int poids) {
        Assert.assertEquals(poids, chassis.getPoids());
    }
}
