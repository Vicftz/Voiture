import org.junit.Before;
import org.junit.Test;
import voiture.Roue;
import voiture.Voiture;

import static org.junit.Assert.*;

public class RoueTest {

    private Roue roue1;
    private Roue roue2;
    private Roue roue3;
    private Voiture voitureTransformers;

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
        voitureTransformers = new Voiture("Mercedes", "rouge");
        roue1 = new Roue();
        roue2 = new Roue(20, 30);
        roue3 = new Roue(20, 30, voitureTransformers);
    }

    // Tests getters
    @Test
    public void testGetVoiture() {
        assertEquals(roue3.getEngin(), voitureTransformers);
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
        assertNull(roue.getEngin());
    }

    @Test
    public void testNewRoue2() {
        Roue roue = new Roue(20, 30);
        assertEquals(roue.getDiametre(), 20, 0);
        assertEquals(roue.getPoids(), 30);
        assertNull(roue.getEngin());
    }

    @Test
    public void testNewRoue3() {
        Roue roue = new Roue(20, 30, voitureTransformers);
        assertEquals(20, roue.getDiametre(), 0);
        assertEquals(30, roue.getPoids());
        assertEquals(voitureTransformers, roue.getEngin());
    }

    // Tests setters
    @Test
    public void testSetVoiture() {
        roue1.setEngin(voitureTransformers);
        assertEquals(roue1.getEngin(), voitureTransformers);
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
        assertNull(roue3.getEngin());
        assertFalse(voitureTransformers.getRoues().contains(roue3));
    }

    @Test
    public void testAddVoitureBiDir() {
        roue2.setEngin(voitureTransformers);
        assertEquals(voitureTransformers, roue2.getEngin());
        assertTrue(voitureTransformers.getRoues().contains(roue2));
    }

    // Tests other methods : nada ?

    // Tests exceptions
    @Test(expected = UnsupportedOperationException.class)
    public void testSetVoitureException() {
        for (int i = 0; i < 4; i++) {
            voitureTransformers.addRoue(new Roue());
        }
        //Déjà 4 roues présentes dans la voitureTransformers, exception levée à la 5ème
        roue3.setEngin(voitureTransformers);
    }

    // Tests domaine validité paramètres
    @Test
    public void testConstructeurDiametreValide() {
        assertEquals(25.0f, new Roue(25.0f, 0).getDiametre(), 0);
    }

    @Test
    public void testConstructeurDiametreInvalide() {
        assertEquals(0.0f, new Roue(-25.0f, 0).getDiametre(), 0);
    }

    @Test
    public void testConstructeurPoidsValide() {
        assertEquals(5, new Roue(0, 5).getPoids());
    }

    @Test
    public void testConstructeurPoidsInvalide() {
        assertEquals(0, new Roue(0, -5).getPoids());
    }

    @Test
    public void testSetterDiametreValide() {
        roue1.setDiametre(25.0f);
        assertEquals(25.0f, roue1.getDiametre(), 0);
    }

    @Test
    public void testSetterDiametreInvalide() {
        roue1.setDiametre(-25.0f);
        assertEquals(0.0f, roue1.getDiametre(), 0);
    }

    @Test
    public void testSetterPoidsValide() {
        roue1.setPoids(5);
        assertEquals(5, roue1.getPoids());
    }

    @Test
    public void testSetterPoidsInvalide() {
        roue1.setPoids(-5);
        assertEquals(0, roue1.getPoids());
    }
}