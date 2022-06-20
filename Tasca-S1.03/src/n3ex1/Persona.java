package n3ex1;

public class Persona {

    private String nom;
    private String cognom;
    private String DNI;

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
}
