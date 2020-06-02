import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface Voiture {
    public String getMarque();

    public void setMarque(String marque);

    public String getCouleur();

    public void setCouleur(String couleur);

    public int getPoids();

    public Chassis getChassis();

    public void setChassis(Chassis chassis);

    public List<Roue> getRoues();

    public void setRoues(ArrayList<Roue> roues);

    public Voiture removeRoue(Roue roue);

    public void addRoue(Roue roue);

    public String toString();
}
