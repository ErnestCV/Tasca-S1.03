package n3ex1.Comparadors;

import n3ex1.Persona;

import java.util.Comparator;

public class ComparadorCognomZA implements Comparator<Persona> {

    public int compare(Persona p1, Persona p2) {
        return p2.getCognom().compareTo(p1.getCognom());
    }

}
