/**
 * src.Carrosserie
 *
 * @author Victor Fritz, Quentin Sauvage
 * @version 28/04/2020
 */
public class Carrosserie {
    // instance variables - replace the example below with your own
    private int poids = 0;

    /**
     * Constructor for objects of class Carosserie
     */
    public Carrosserie(int poids) {
        this.poids = Math.max(poids, 0);
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
}
