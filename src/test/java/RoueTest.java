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
        roue2 = new Roue(20,30);
        roue3 = new Roue(20,30,voiture);
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
        assertEquals(roue2.getDiametre(), 20,0);
    }

    @Test
    public void testGetPoids() {
        assertEquals(roue2.getPoids(), 30);
    }

    // Tests constructors
    @Test
    public void testNewRoue1() {
        assertEquals(roue1.getDiametre(), 0,0);
        assertEquals(roue1.getPoids(), 0);
        assertNull(roue1.getVoiture());
    }

    @Test
    public void testNewRoue2() {
        assertEquals(roue2.getDiametre(), 20,0);
        assertEquals(roue2.getPoids(), 30);
        assertNull(roue2.getVoiture());
    }

    @Test
    public void testNewRoue3() {
        assertEquals(roue3.getDiametre(), 20,0);
        assertEquals(roue3.getPoids(), 30);
        assertEquals(roue3.getVoiture(), voiture);
    }

    // Tests setters
    @Test
    public void testSetVoiture() {
        roue1.setVoiture(voiture);
        assertEquals(voiture, roue1.getVoiture());
    }

    @Test
    public void testSetDiametre() {
        roue1.setDiametre(100);
        assertEquals(roue1.getDiametre(),100,0);
    }

    @Test
    public void testSetPoids() {
        roue1.setPoids(100);
        assertEquals(roue1.getPoids(),100);
    }

    // Tests associations

    // Tests other methods : nada ?

    // Tests exceptions
    @Test(expected = UnsupportedOperationException.class)
    public void testSetVoitureException() {
        for (int i=0; i<4; i++){
            voiture.addRoue(new Roue());
        }
        //Déjà 4 roues présentes dans la voiture, exception levée à la 5ème
        roue3.setVoiture(voiture);
    }
}