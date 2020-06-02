import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VoitureFactoryTest {
    private VoitureFactory voitureFactory;

    @Before
    public void setUp() {
        voitureFactory = new VoitureFactory();
    }

    /**
     * Tears down the test fixture.
     * <p>
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }

    @Test
    public void testCreateVoiture() {
        VehiculeDestructeur v = voitureFactory.createVoiture("TRANSFORMERS");
        assertEquals(Voiture.class, v.getClass());
    }
}
