public class Roue {
    private Voiture voiture;
    private float diametre;
    private int poids;

    public Roue() {
        this.diametre = (float) 0.0;
        this.poids = 0;
    }

    public Roue(float diametre, int poids) {
        this.diametre = diametre;
        this.poids = poids;
    }

    public Roue(float diametre, int poids, Voiture voiture) {
        this(diametre, poids);
        this.voiture = voiture;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) throws UnsupportedOperationException {
        this.voiture = voiture;
        if (!voiture.getRoues().contains(this)) {
            voiture.addRoue(this);
        }
    }

    public float getDiametre() {
        return diametre;
    }

    public void setDiametre(float diametre) {
        this.diametre = diametre;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
}
