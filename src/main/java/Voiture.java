import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Classe src.Voiture
 *
 * @author Victor Fritz, Quentin Sauvage
 * @version 28/04/2020
 */
public class Voiture {
    // variables d'instance - remplacez l'exemple qui suit par le votre
    private String marque;
    private String couleur;
    private Carrosserie carrosserie;
    private List<Roue> roues = new ArrayList<>();

    /**
     * Constructeur d'objets de classe src.Voiture
     */
    public Voiture(String marque, String couleur) {
        // initialisation des variables d'instance
        this.marque = marque;
        this.couleur = couleur;
    }

    public Voiture(String marque, String couleur, Carrosserie carrosserie) {
        // initialisation des variables d'instance
        this(marque, couleur);
        this.carrosserie = carrosserie;
    }

    public Voiture(String marque, String couleur, Carrosserie carrosserie, ArrayList<Roue> roues) {
        // initialisation des variables d'instance
        this(marque, couleur, carrosserie);
        this.roues = roues;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPoids() {
        int poids = this.carrosserie.getPoids();
        for (Roue roue : this.roues) {
            poids += roue.getPoids();
        }
        return poids;
    }

    public Carrosserie getCarrosserie() {
        return this.carrosserie;
    }

    public void setCarrosserie(Carrosserie carrosserie) {
        this.carrosserie = carrosserie;
    }

    public List<Roue> getRoues() {
        return Collections.unmodifiableList(roues);
    }

    public void setRoues(ArrayList<Roue> roues) {
        this.roues = roues;
    }

    public Voiture removeRoue(Roue roue) {
        if (this.roues.contains(roue)) {
            this.roues.remove(roue);
            roue.removeVoiture();
        }
        return this;
    }

    public void addRoue(Roue roue) {
        if (this.roues.size() < 4) {
            this.roues.add(roue);
            if (roue.getVoiture() != this) {
                roue.setVoiture(this);
            }
        } else {
            throw new UnsupportedOperationException("La voiture a déjà 4 roues");
        }
    }

    public String toString() {
        return this.marque + " de couleur " + couleur;
    }
}
