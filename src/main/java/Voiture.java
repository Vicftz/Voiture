import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe src.Voiture
 *
 * @author Victor Fritz, Quentin Sauvage
 * @version 28/04/2020
 */
public class Voiture
{
    // variables d'instance - remplacez l'exemple qui suit par le votre
    private String marque;
    private String couleur;
    private Carrosserie carrosserie;
    private List<Roue> roues = new ArrayList<>();

    /**
     * Constructeur d'objets de classe src.Voiture
     */
    public Voiture(String marque, String couleur)
    {
        // initialisation des variables d'instance
        this.marque = marque;
        this.couleur = couleur;
    }

    public Voiture(String marque, String couleur, Carrosserie carrosserie)
    {
        // initialisation des variables d'instance
        new Voiture(marque, couleur);
        this.carrosserie = carrosserie;
    }

    public Voiture(String marque, String couleur, Carrosserie carrosserie, ArrayList<Roue> roues)
    {
        // initialisation des variables d'instance
        new Voiture(marque, couleur, carrosserie);
        roues.addAll(this.roues);
    }
    
    public String getMarque(){
        return this.marque;
    }
    public void setMarque(String marque){
        this.marque = marque;
    }
    public String getCouleur(){
        return this.couleur;
    }
    public void setCouleur(String couleur){
        this.couleur = couleur;
    }
    
    public int getPoids(){
        int poids = 0;
        for (Roue roue: this.roues) {
            poids+= roue.getPoids();
        }
        poids += this.carrosserie.getPoids();
        return poids;
    }
    
    public Carrosserie getCarrosserie()
    {
        return this.carrosserie;
    }
    
    public void setCarrosserie(Carrosserie carrosserie)
    {
        this.carrosserie = carrosserie;
    }

    public List<Roue> getRoues() {
        return Collections.unmodifiableList(roues);
    }

    public void setRoues(ArrayList<Roue> roues) {
        roues.addAll(this.roues);
    }

    public void addRoue(Roue roue) throws Exception {
        System.out.println("Il y a " + this.roues.size() + " dans la voiture");
        if(this.roues.size() <4){
            this.roues.add(roue);
        } else {
            throw new Exception("La voiture a déjà 4 roues");
        }
    }

    public String toString()
    {
        return this.marque + " de couleur " + couleur;
    }
}
