package n3ex1.Comparadors;

import n3ex1.Persona;

import java.util.Comparator;

public class ComparadorNomAZ implements Comparator<Persona> {

    public int compare(Persona p1, Persona p2) {
        return p1.getNom().compareTo(p2.getNom());
    }

}
