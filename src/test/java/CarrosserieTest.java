import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarrosserieTest {
    private Carrosserie carrosserie1;

    /**
     * Default constructor for test class src.VoitureTest
     */
    public CarrosserieTest() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        carrosserie1 = new Carrosserie(1000);
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
    public void testGetPoids() {
        assertEquals(1000, carrosserie1.getPoids());
    }

    // Tests constructors
    @Test
    public void testCarrosserie() {
        Carrosserie carrosserie = new Carrosserie(2000);
        assertEquals(2000, carrosserie.getPoids());
    }

    // Tests setters
    @Test
    public void testSetPoids() {
        carrosserie1.setPoids(1500);
        assertEquals(1500, carrosserie1.getPoids());
    }

    // Tests associations

    // Tests other methods : nada

    // Tests exceptions : nada
}
