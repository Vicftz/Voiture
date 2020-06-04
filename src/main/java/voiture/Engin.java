package voiture;

import java.util.List;

public interface Engin {
    void removeRoue(Roue roue);

    void addRoue(Roue roue);

    List<Roue> getRoues();

    String toString();
}
