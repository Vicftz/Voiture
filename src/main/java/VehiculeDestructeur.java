import java.util.ArrayList;
import java.util.List;

public interface VehiculeDestructeur {
    String getMarque();

    void setMarque(String marque);

    String getCouleur();

    void setCouleur(String couleur);

    int getPoids();

    Chassis getChassis();

    void setChassis(Chassis chassis);

    List<Roue> getRoues();

    void setRoues(ArrayList<Roue> roues);

    VehiculeDestructeur removeRoue(Roue roue);

    void addRoue(Roue roue);

    String toString();
}
