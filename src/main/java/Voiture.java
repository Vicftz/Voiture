import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voiture implements VehiculeDestructeur {
    private String marque;
    private String couleur;
    private Chassis chassis;
    private List<Roue> roues = new ArrayList<>();
    private int poids;

    /**
     * Constructeur d'objets de classe src.Voiture
     */
    public Voiture(){
        this.marque = "";
        this.couleur = "";
    }
    public Voiture(String marque, String couleur) {
        // initialisation des variables d'instance
        this.marque = marque;
        this.couleur = couleur;
    }

    public Voiture(String marque, String couleur, Chassis chassis) {
        // initialisation des variables d'instance
        this(marque, couleur);
        this.chassis = chassis;
    }

    public Voiture(String marque, String couleur, Chassis chassis, ArrayList<Roue> roues) {
        // initialisation des variables d'instance
        this(marque, couleur, chassis);
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
        poids = this.chassis.getPoids();
        for (Roue roue : this.roues) {
            poids += roue.getPoids();
        }
        return poids;
    }

    public Chassis getChassis() {
        return this.chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
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
            if (roue.getVehiculeDestructeur() != this) {
                roue.setVehiculeDestructeur(this);
            }
        } else {
            throw new UnsupportedOperationException("La voiture a déjà 4 roues");
        }
    }

    public String toString() {
        return this.marque + " de couleur " + couleur;
    }
}
