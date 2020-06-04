package voiture;

public class Roue {
    private Engin engin;
    private float diametre;
    private int poids;

    public Roue() {
        this.diametre = (float) 0.0;
        this.poids = 0;
    }

    public Roue(float diametre, int poids) {
        this.diametre = Math.max(diametre, 0.0f);
        this.poids = Math.max(poids, 0);
    }

    public Roue(float diametre, int poids, Engin engin) {
        this(diametre, poids);
        this.engin = engin;
    }

    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) throws UnsupportedOperationException {
        this.engin = engin;
        if (!engin.getRoues().contains(this)) {
            engin.addRoue(this);
        }
    }

    public void removeVoiture() {
        if (this.engin != null) {
            this.engin.removeRoue(this);
            this.engin = null;
        }
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
