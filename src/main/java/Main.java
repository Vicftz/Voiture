public class Main {

    public static void main(String[] args) throws Exception {

        Carrosserie carrosserie = new Carrosserie(100);
        Voiture voiture = new Voiture("Mercedes", "rouge");
        Roue roue1 = new Roue();
        roue1.setVoiture(voiture);
        System.out.println(voiture.getPoids());
    }


}
