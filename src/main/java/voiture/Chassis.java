package voiture;

public class Chassis {
    private int poids;

    public Chassis() {
        this.poids = 0;
    }

    public Chassis(int poids) {
        this.poids = Math.max(poids, 0);
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = Math.max(poids, 0);
    }
}
