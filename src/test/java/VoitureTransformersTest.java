import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VoitureTransformersTest {
    private Chassis chassis1;
    private VoitureTransformers voitureTransformers1;
    private ArrayList<Roue> roueList = new ArrayList<>();
    private Roue roue1;
    private Roue roue2;

    /**
     * Default constructor for test class src.VoitureTransformersTest
     */
    public VoitureTransformersTest() {
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
        voitureTransformers1 = new VoitureTransformers("Rolls Royce", "noire", chassis1, roueList);
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
        assertEquals("Rolls Royce", voitureTransformers1.getMarque());
    }

    @Test
    public void testGetCouleur() {
        assertEquals("noire", voitureTransformers1.getCouleur());
    }

    @Test
    public void testGetChassis() {
        assertEquals(chassis1, voitureTransformers1.getChassis());
    }

    @Test
    public void testGetRoues() {
        assertEquals(roueList, voitureTransformers1.getRoues());
    }

    // Tests constructors
    @Test
    public void testNewVoiture1() {
        voitureTransformers1 = new VoitureTransformers("Mercedes", "rouge");
        assertEquals("Mercedes", voitureTransformers1.getMarque());
        assertEquals("rouge", voitureTransformers1.getCouleur());
    }

    @Test
    public void testNewVoiture2() {
        voitureTransformers1 = new VoitureTransformers("Mercedes", "rouge", chassis1);
        assertEquals("Mercedes", voitureTransformers1.getMarque());
        assertEquals("rouge", voitureTransformers1.getCouleur());
        assertEquals(chassis1, voitureTransformers1.getChassis());

    }

    @Test
    public void testNewVoiture3() {
        voitureTransformers1 = new VoitureTransformers("Mercedes", "rouge", chassis1, roueList);
        assertEquals("Mercedes", voitureTransformers1.getMarque());
        assertEquals("rouge", voitureTransformers1.getCouleur());
        assertEquals(chassis1, voitureTransformers1.getChassis());
        assertEquals(roueList, voitureTransformers1.getRoues());
    }

    // Tests setters
    @Test
    public void testSetMarque() {
        voitureTransformers1.setMarque("Toyota");
        assertEquals("Toyota", voitureTransformers1.getMarque());
    }

    @Test
    public void testSetCouleur() {
        voitureTransformers1.setCouleur("vert");
        assertEquals("vert", voitureTransformers1.getCouleur());
    }

    @Test
    public void testSetChassis() {
        chassis1 = new Chassis(10);
        voitureTransformers1.setChassis(chassis1);
        assertEquals(chassis1, voitureTransformers1.getChassis());
    }

    @Test
    public void testSetRoues() {
        roueList = new ArrayList<>();
        roueList.add(roue1);
        roueList.add(roue2);
        voitureTransformers1.setRoues(roueList);
        assertEquals(roueList, voitureTransformers1.getRoues());
    }

    // Tests associations
    @Test
    public void testRemoveRoueBiDir() {
        voitureTransformers1.removeRoue(roue1);
        assertFalse(voitureTransformers1.getRoues().contains(roue1));
        assertNull(roue1.getVoiture());
    }

    @Test
    public void testAddRoueBiDir() {
        voitureTransformers1.addRoue(roue2);
        assertTrue(voitureTransformers1.getRoues().contains(roue2));
        assertEquals(voitureTransformers1, roue2.getVoiture());
    }

    // Tests autres méthodes
    @Test
    public void testGetPoids() {
        assertEquals(1000, voitureTransformers1.getPoids());
    }

    @Test
    public void testAddRoue() {
        voitureTransformers1.addRoue(roue2);
        assertTrue(voitureTransformers1.getRoues().contains(roue2));
    }

    // Tests exceptions
    @Test(expected = UnsupportedOperationException.class)
    public void testAddRoueException() {
        voitureTransformers1 = new VoitureTransformers("Mercedes", "rouge");
        for (int i = 0; i < 5; i++) {
            voitureTransformers1.addRoue(new Roue());
        }
    }

    @Test
    public void testToString() {
        assertEquals("Rolls Royce de couleur noire", voitureTransformers1.toString());
    }

    // Tests domaine validité paramètres : nada
}

