import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChassisCucumberTest {
    @Given("le client crée un nouveau chassis sans spécifier son poids")
    public void leClientCréeUnNouveauChassisSansSpécifierSonPoids() {
    }

    @When("le client applique au chassis un poids positif")
    public void leClientAppliqueAuChassisUnPoidsPositif() {
    }

    @Then("le chassis est créé et son poids est enregistré avec celui indiqué en entrée")
    public void leChassisEstCrééEtSonPoidsEstEnregistréAvecCeluiIndiquéEnEntrée() {
    }

    @When("le client applique au chassis un poids négatif")
    public void leClientAppliqueAuChassisUnPoidsNégatif() {
    }

    @Then("le chassis est créé et son poids est enregistré avec une valeur de {int}")
    public void leChassisEstCrééEtSonPoidsEstEnregistréAvecUneValeurDe(int arg0) {
    }
}
