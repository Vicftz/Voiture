public class Main {

    public static void main(String[] args) throws Exception {

        Carrosserie carrosserie = new Carrosserie(100);
        Voiture voiture = new Voiture("Ferrari", "rouge", carrosserie);
        for (int i=0; i<4; i++){
            Roue roue = new Roue(20,30);
            voiture.addRoue(roue);
        }
        System.out.println(voiture.getPoids());
    }


}
