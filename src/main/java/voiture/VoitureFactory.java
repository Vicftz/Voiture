package voiture;

public class VoitureFactory {
    public Engin createVoiture(String voitureType) {
        return new Voiture();
    }
}
