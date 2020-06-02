public class VoitureFactory {
    public Voiture createVoiture(String voitureType){
        if(voitureType.equalsIgnoreCase("TRANSFORMERS")){
            return new VoitureTransformers();

        } else if(voitureType.equalsIgnoreCase("CITADINE")){
            return new VoitureCitadine();
        }
        return null;
    }
}
