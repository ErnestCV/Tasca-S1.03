package n3ex1.Comparadors;

import n3ex1.Persona;

import java.util.Comparator;

public class ComparadorDNI19 implements Comparator<Persona> {

    public int compare(Persona p1, Persona p2) {
        return p1.getDNI().compareTo(p2.getDNI());
    }

}
