import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class src.VoitureTest.
 *
 * @author Fritz, Sauvage
 * @version 29/04/2020
 */
public class VoitureTest {
    private Carrosserie carrosse1;
    private Voiture voiture1;

    /**
     * Default constructor for test class src.VoitureTest
     */
    public VoitureTest() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        carrosse1 = new Carrosserie(1000);
        voiture1 = new Voiture("Rolls Royce", "noire", carrosse1);
    }

    /**
     * Tears down the test fixture.
     * <p>
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }

    // Tests getters
    @Test
    public void testGetMarque() {
        assertEquals();
    }

    @Test
    public void testGetCouleur() {
        assertEquals();
    }

    @Test
    public void testGetCarrosserie() {
        assertEquals();
    }

    @Test
    public void testGetRoues() {
        assertEquals();
    }

    // Tests constructors
    @Test
    public void testNewVoiture1(){

    }

    @Test
    public void testNewVoiture2(){

    }

    @Test
    public void testNewVoiture3(){

    }

    // Tests setters
    @Test
    public void testSetMarque(){

    }

    @Test
    public void testSetCouleur(){

    }

    @Test
    public void testSetCarrosserie(){

    }

    @Test
    public void testSetRoues(){

    }

    // Tests associations


    // Tests autres méthodes
    @Test
    public void testGetPoids() {
        assertEquals(1000, voiture1.getPoids());
    }

    @Test
    public void testAddRoue() {

    }

    // Tests exceptions
    @Test
    public void testAddRoueException() {
        assertThrows();
    }

    @Test
    public void testToString() {
        assertEquals("Rolls Royce de couleur noire", voiture1.toString());
    }


}

