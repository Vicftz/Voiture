import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class src.VoitureTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VoitureTest
{
    private Carrosserie carrosse1;
    private Voiture voiture1;
    
    /**
     * Default constructor for test class src.VoitureTest
     */
    public VoitureTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        carrosse1 = new Carrosserie(1000);
        voiture1 = new Voiture("Rolls Royce", "noire", carrosse1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testToString()
    {
        assertEquals("Rolls Royce de couleur noire", voiture1.toString());
    }
    
    @Test
    public void testGetPoids()
    {
        assertEquals(1000, voiture1.getPoids());
    }
}

