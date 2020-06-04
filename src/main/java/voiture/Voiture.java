package voiture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Voiture implements Engin {
    private String marque;
    private String couleur;
    private Chassis chassis;
    private List<Roue> roues = new ArrayList<>();

    public Voiture() {
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

    @Override
    public String getMarque() {
        return this.marque;
    }

    @Override
    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String getCouleur() {
        return this.couleur;
    }

    @Override
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public int getPoids() {
        int poids = this.chassis.getPoids();
        for (Roue roue : this.roues) {
            poids += roue.getPoids();
        }
        return poids;
    }

    @Override
    public Chassis getChassis() {
        return this.chassis;
    }

    @Override
    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    @Override
    public List<Roue> getRoues() {
        return Collections.unmodifiableList(roues);
    }

    @Override
    public void setRoues(ArrayList<Roue> roues) {
        this.roues = roues;
    }

    @Override
    public void removeRoue(Roue roue) {
        if (this.roues.contains(roue)) {
            this.roues.remove(roue);
            roue.removeVoiture();
        }
    }

    @Override
    public void addRoue(Roue roue) {
        if (this.roues.size() < 4) {
            this.roues.add(roue);
            if (roue.getEngin() != this) {
                roue.setEngin(this);
            }
        } else {
            throw new UnsupportedOperationException("La voiture a déjà 4 roues");
        }
    }

    @Override
    public String toString() {
        return this.marque + " de couleur " + couleur;
    }
}
