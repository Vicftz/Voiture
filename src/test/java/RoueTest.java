import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoueTest {

    private Roue roue1;
    private Roue roue2;
    private Roue roue3;
    private Voiture voiture;

    /**
     * Default constructor for test class src.VoitureTest
     */
    public RoueTest() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        voiture = new Voiture("Mercedes", "rouge");
        roue1 = new Roue();
        roue2 = new Roue(20, 30);
        roue3 = new Roue(20, 30, voiture);
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
    public void testGetVoiture() {
        assertEquals(roue3.getVoiture(), voiture);
    }

    @Test
    public void testGetDiametre() {
        assertEquals(20, roue2.getDiametre(), 0);
    }

    @Test
    public void testGetPoids() {
        assertEquals(30, roue2.getPoids());
    }

    // Tests constructors
    @Test
    public void testNewRoue1() {
        Roue roue = new Roue();
        assertEquals(0, roue.getDiametre(), 0);
        assertEquals(0, roue.getPoids());
        assertNull(roue.getVoiture());
    }

    @Test
    public void testNewRoue2() {
        Roue roue = new Roue(20, 30);
        assertEquals(roue.getDiametre(), 20, 0);
        assertEquals(roue.getPoids(), 30);
        assertNull(roue.getVoiture());
    }

    @Test
    public void testNewRoue3() {
        Roue roue = new Roue(20, 30, voiture);
        assertEquals(20, roue.getDiametre(), 0);
        assertEquals(30, roue.getPoids());
        assertEquals(voiture, roue.getVoiture());
    }

    // Tests setters
    @Test
    public void testSetVoiture() {
        roue1.setVoiture(voiture);
        assertEquals(roue1.getVoiture(), voiture);
    }

    @Test
    public void testSetDiametre() {
        roue1.setDiametre(100);
        assertEquals(100, roue1.getDiametre(), 0);
    }

    @Test
    public void testSetPoids() {
        roue1.setPoids(100);
        assertEquals(100, roue1.getPoids());
    }

    // Tests associations
    @Test
    public void testRemoveVoitureBiDir() {
        roue3.removeVoiture();
        assertNull(roue3.getVoiture());
        assertFalse(voiture.getRoues().contains(roue3));
    }

    @Test
    public void testAddVoitureBiDir() {
        roue2.setVoiture(voiture);
        assertEquals(voiture, roue2.getVoiture());
        assertTrue(voiture.getRoues().contains(roue2));
    }

    // Tests other methods : nada ?

    // Tests exceptions
    @Test(expected = UnsupportedOperationException.class)
    public void testSetVoitureException() {
        for (int i = 0; i < 4; i++) {
            voiture.addRoue(new Roue());
        }
        //Déjà 4 roues présentes dans la voiture, exception levée à la 5ème
        roue3.setVoiture(voiture);
    }

    // Tests domaine validité paramètres
    
}