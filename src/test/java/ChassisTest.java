import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChassisTest {
    private Chassis chassis1;

    /**
     * Default constructor for test class src.VoitureTest
     */
    public ChassisTest() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        chassis1 = new Chassis(1000);
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
        assertEquals(1000, chassis1.getPoids());
    }

    // Tests constructors
    @Test
    public void testChassisSansPoids() {
        Chassis chassis = new Chassis();
        assertEquals(0, chassis.getPoids());
    }

    @Test
    public void testChassis() {
        Chassis chassis = new Chassis(2000);
        assertEquals(2000, chassis.getPoids());
    }

    // Tests setters
    @Test
    public void testSetPoids() {
        chassis1.setPoids(1500);
        assertEquals(1500, chassis1.getPoids());
    }

    // Tests associations : nada

    // Tests other methods : nada

    // Tests exceptions : nada

    // Tests domaine validité paramètres
    @Test
    public void testConstructeurPoidsValide() {
        assertEquals(1000, new Chassis(1000).getPoids());
    }

    @Test
    public void testConstructeurPoidsInvalide() {
        assertEquals(0, new Chassis(-1000).getPoids());
    }

    @Test
    public void testSetterPoidsValide() {
        chassis1.setPoids(1500);
        assertEquals(1500, chassis1.getPoids());
    }

    @Test
    public void testSetterPoidsInvalide() {
        assertEquals(0, new Chassis(-1000).getPoids());
    }
}
