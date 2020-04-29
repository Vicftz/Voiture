import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * The test class src.VoitureTest.
 *
 * @author Fritz, Sauvage
 * @version 29/04/2020
 */
public class VoitureTest {
    private Carrosserie carrosse1;
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
        carrosse1 = new Carrosserie(1000);
        roue1 = new Roue();
        roue2 = new Roue(10,10);
        roueList.add(roue1);
        voiture1 = new Voiture("Rolls Royce", "noire", carrosse1, roueList);
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
        assertEquals(voiture1.getMarque(),"Rolls Royce");
    }

    @Test
    public void testGetCouleur() {
        assertEquals(voiture1.getCouleur(),"noire");
    }

    @Test
    public void testGetCarrosserie() {
        assertEquals(voiture1.getCarrosserie(), carrosse1);
    }

    @Test
    public void testGetRoues() {
        assertEquals(voiture1.getRoues(), roueList);
    }

    // Tests constructors
    @Test
    public void testNewVoiture1(){
        voiture1 = new Voiture("Mercedes", "rouge");
        assertEquals(voiture1.getMarque(),"Mercedes");
        assertEquals(voiture1.getCouleur(),"rouge");
    }

    @Test
    public void testNewVoiture2(){
        voiture1 = new Voiture("Mercedes", "rouge", carrosse1);
        assertEquals(voiture1.getMarque(),"Mercedes");
        assertEquals(voiture1.getCouleur(),"rouge");
        assertEquals(voiture1.getCarrosserie(), carrosse1);

    }

    @Test
    public void testNewVoiture3(){
        voiture1 = new Voiture("Mercedes", "rouge", carrosse1, roueList);
        assertEquals(voiture1.getMarque(),"Mercedes");
        assertEquals(voiture1.getCouleur(),"rouge");
        assertEquals(voiture1.getCarrosserie(), carrosse1);
        assertEquals(voiture1.getRoues(), roueList);
    }

    // Tests setters
    @Test
    public void testSetMarque(){
        voiture1.setMarque("Toyota");
        assertEquals(voiture1.getMarque(),"Toyota");
    }

    @Test
    public void testSetCouleur(){
        voiture1.setCouleur("vert");
        assertEquals(voiture1.getCouleur(),"vert");
    }

    @Test
    public void testSetCarrosserie(){
        carrosse1 = new Carrosserie(10);
        voiture1.setCarrosserie(carrosse1);
        assertEquals(voiture1.getCarrosserie(), carrosse1);
    }

    @Test
    public void testSetRoues(){
        roueList = new ArrayList<>();
        roueList.add(roue1);
        roueList.add(roue2);
        voiture1.setRoues(roueList);
        assertEquals(voiture1.getRoues(), roueList);
    }

    // Tests associations


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
        for (int i=0; i<5; i++){
            voiture1.addRoue(new Roue());
        }
    }

    @Test
    public void testToString() {
        assertEquals("Rolls Royce de couleur noire", voiture1.toString());
    }


}

