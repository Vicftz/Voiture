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

    @When("le client applique au chassis un {int} positif")
    public void le_client_applique_au_chassis_un_positif(Integer int1) {
        chassis.setPoids(int1);
    }

    @Then("le chassis est créé et son {int} est celui indiqué en entrée")
    public void le_chassis_est_créé_et_son_est_celui_indiqué_en_entrée(Integer int1) {
        assertEquals(int1, Integer.valueOf(chassis.getPoids()));
    }

    @When("le client applique au chassis un {int} négatif")
    public void le_client_applique_au_chassis_un_négatif(Integer int1) {
        chassis.setPoids(int1);
    }

    @Then("le chassis est créé et son poids est enregistré avec une valeur de {int}")
    public void le_chassis_est_créé_et_son_poids_est_enregistré_avec_une_valeur_de(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(int1, Integer.valueOf(chassis.getPoids()));
    }
}
