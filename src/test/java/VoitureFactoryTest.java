import org.junit.Before;
import org.junit.Test;
import voiture.Engin;
import voiture.Voiture;
import voiture.VoitureFactory;

import static org.junit.Assert.assertEquals;

public class VoitureFactoryTest {
    private VoitureFactory voitureFactory;

    @Before
    public void setUp() {
        voitureFactory = new VoitureFactory();
    }

    @Test
    public void testCreateVoiture() {
        Engin v = voitureFactory.createVoiture("TRANSFORMERS");
        assertEquals(Voiture.class, v.getClass());
    }
}
