import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VoitureTest {
    private Chassis chassis1;
    private Voiture voiture1;
    private ArrayList<Roue> roueList = new ArrayList<>();
    private Roue roue1;
    private Roue roue2;

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
        chassis1 = new Chassis(1000);
        roue1 = new Roue();
        roue2 = new Roue(10, 10);
        roueList.add(roue1);
        voiture1 = new Voiture("Rolls Royce", "noire", chassis1, roueList);
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
        assertEquals("Rolls Royce", voiture1.getMarque());
    }

    @Test
    public void testGetCouleur() {
        assertEquals("noire", voiture1.getCouleur());
    }

    @Test
    public void testGetChassis() {
        assertEquals(chassis1, voiture1.getChassis());
    }

    @Test
    public void testGetRoues() {
        assertEquals(roueList, voiture1.getRoues());
    }

    // Tests constructors
    @Test
    public void testNewVoiture1() {
        voiture1 = new Voiture("Mercedes", "rouge");
        assertEquals("Mercedes", voiture1.getMarque());
        assertEquals("rouge", voiture1.getCouleur());
    }

    @Test
    public void testNewVoiture2() {
        voiture1 = new Voiture("Mercedes", "rouge", chassis1);
        assertEquals("Mercedes", voiture1.getMarque());
        assertEquals("rouge", voiture1.getCouleur());
        assertEquals(chassis1, voiture1.getChassis());

    }

    @Test
    public void testNewVoiture3() {
        voiture1 = new Voiture("Mercedes", "rouge", chassis1, roueList);
        assertEquals("Mercedes", voiture1.getMarque());
        assertEquals("rouge", voiture1.getCouleur());
        assertEquals(chassis1, voiture1.getChassis());
        assertEquals(roueList, voiture1.getRoues());
    }

    // Tests setters
    @Test
    public void testSetMarque() {
        voiture1.setMarque("Toyota");
        assertEquals("Toyota", voiture1.getMarque());
    }

    @Test
    public void testSetCouleur() {
        voiture1.setCouleur("vert");
        assertEquals("vert", voiture1.getCouleur());
    }

    @Test
    public void testSetChassis() {
        chassis1 = new Chassis(10);
        voiture1.setChassis(chassis1);
        assertEquals(chassis1, voiture1.getChassis());
    }

    @Test
    public void testSetRoues() {
        roueList = new ArrayList<>();
        roueList.add(roue1);
        roueList.add(roue2);
        voiture1.setRoues(roueList);
        assertEquals(roueList, voiture1.getRoues());
    }

    // Tests associations
    @Test
    public void testRemoveRoueBiDir() {
        voiture1.removeRoue(roue1);
        assertFalse(voiture1.getRoues().contains(roue1));
        assertNull(roue1.getVehiculeDestructeur());
    }

    @Test
    public void testAddRoueBiDir() {
        voiture1.addRoue(roue2);
        assertTrue(voiture1.getRoues().contains(roue2));
        assertEquals(voiture1, roue2.getVehiculeDestructeur());
    }

    // Tests autres méthodes
    @Test
    public void testGetPoids() {
        assertEquals(1000, voiture1.getPoids());
    }

    @Test
    public void testAddRoue() {
        voiture1.addRoue(roue2);
        assertTrue(voiture1.getRoues().contains(roue2));
    }

    // Tests exceptions
    @Test(expected = UnsupportedOperationException.class)
    public void testAddRoueException() {
        voiture1 = new Voiture("Mercedes", "rouge");
        for (int i = 0; i < 5; i++) {
            voiture1.addRoue(new Roue());
        }
    }

    @Test
    public void testToString() {
        assertEquals("Rolls Royce de couleur noire", voiture1.toString());
    }

    // Tests domaine validité paramètres : nada
}

