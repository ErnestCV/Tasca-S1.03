package n3ex1;

public class Persona {

    private final String nom;
    private final String cognom;
    private final String DNI;

    public Persona(String nom, String cognom, String DNI) {
        this.nom = nom;
        this.cognom = cognom;
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getDNI() {
        return DNI;
    }


//    @Override
//    public String toString() {
//        return "Persona{" +
//                "nom='" + nom + '\'' +
//                ", cognom='" + cognom + '\'' +
//                ", DNI='" + DNI + '\'' +
//                '}';
//    }

}

