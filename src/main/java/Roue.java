public class Roue {
    private VehiculeDestructeur vehiculeDestructeur;
    private float diametre;
    private int poids;

    public Roue() {
        this.diametre = (float) 0.0;
        this.poids = 0;
    }

    public Roue(float diametre, int poids) {
        this.diametre = Math.max(diametre, 0.0f);
        this.poids = Math.max(poids, 0);
        ;
    }

    public Roue(float diametre, int poids, VehiculeDestructeur vehiculeDestructeur) {
        this(diametre, poids);
        this.vehiculeDestructeur = vehiculeDestructeur;
    }

    public VehiculeDestructeur getVehiculeDestructeur() {
        return vehiculeDestructeur;
    }

    public void setVehiculeDestructeur(VehiculeDestructeur vehiculeDestructeur) throws UnsupportedOperationException {
        this.vehiculeDestructeur = vehiculeDestructeur;
        if (!vehiculeDestructeur.getRoues().contains(this)) {
            vehiculeDestructeur.addRoue(this);
        }
    }

    public Roue removeVoiture() {
        if (this.vehiculeDestructeur != null) {
            this.vehiculeDestructeur.removeRoue(this);
            this.vehiculeDestructeur = null;
        }
        return this;
    }

    public float getDiametre() {
        return diametre;
    }

    public void setDiametre(float diametre) {
        this.diametre = Math.max(diametre, 0.0f);
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = Math.max(poids, 0);
    }
}
