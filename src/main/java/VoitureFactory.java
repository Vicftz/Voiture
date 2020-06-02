public class VoitureFactory {
    public VehiculeDestructeur createVoiture(String voitureType){
        if(voitureType.equalsIgnoreCase("TRANSFORMERS")){
            return new Voiture();

        }
        return null;
    }
}
