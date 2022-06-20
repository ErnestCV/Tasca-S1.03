package n3ex1;

import n3ex1.Comparadors.*;

import java.io.IOException;
import java.util.*;

public class Arxiu {

    private static GestioFitxer gestio;
    private final Scanner scanner = new Scanner(System.in);

    public Arxiu() {
        gestio = new GestioFitxer();
    }

    public void iniciar() {
        boolean exit = false;

        do {
            switch (menu()) {
                //Introduir persona
                case 1 -> introduirPersona();

                //Mostrar les persones ordenades per nom (A-Z)
                case 2 -> mostrarNomAZ();

                //Mostrar les persones ordenades per nom (Z-A)
                case 3 -> mostrarNomZA();

                //Mostrar les persones ordenades per cognoms (A-Z)
                case 4 -> mostrarCognomAZ();

                //Mostrar les persones ordenades per cognoms (Z-A)
                case 5 -> mostrarCognomZA();

                //Mostrar les persones ordenades per DNI (1-9)
                case 6 -> mostrarDNI19();

                //Mostrar les persones ordenades per DNI (9-1)
                case 7 -> mostrarDNI91();

                //Sortir del programa
                case 0 -> {
                    System.out.println("Sortint de l'aplicació");
                    exit = true;
                }
            }

        } while (!exit);

    }

    private byte menu() {
        byte select;
        final byte MIN = 0;
        final byte MAX = 7;

        do {
            System.out.println("""
                    -------------------
                    Escolliu una opció:
                    1: Introduir persona
                    2: Mostrar les persones ordenades per nom (A-Z)
                    3: Mostrar les persones ordenades per nom (Z-A)
                    4: Mostrar les persones ordenades per cognoms (A-Z)
                    5: Mostrar les persones ordenades per cognoms (Z-A)
                    6: Mostrar les persones ordenades per DNI (1-9)
                    7: Mostrar les persones ordenades per DNI (9-1)
                    0: Sortir
                    ------------------
                        """);

            select = scanner.nextByte();
            scanner.nextLine();

            if (select < MIN | select > MAX) {
                System.out.println("Introdueix una opció vàlida.");
            }
        } while (select < MIN | select > MAX);

        return select;
    }

    private void introduirPersona() {

        System.out.println("Introdueix el nom:");
        String nom = scanner.next();
        String cognom;
        System.out.println("Introdueix el primer cognom:");
        String primerCognom = scanner.next();
        System.out.println("Introdueix el segon cognom, o el DNI si no hi ha 2n cognom:");
        String segonCognom = scanner.next();
        String dni;
        if (!Character.isDigit(segonCognom.charAt(0))) {
            System.out.println("Introdueix el DNI:");
            dni = scanner.next();
            cognom = primerCognom + " " + segonCognom;
        } else {
            dni = segonCognom;
            cognom = primerCognom;
        }

        try {
            gestio.introduirPersona(new Persona(nom, cognom, dni));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void printData(List<Persona> llista){

        System.out.printf("%-10s %-18s \t%-10s %n", "Nom", "Cognom", "DNI");
        System.out.printf("%-10s %-18s \t%-10s %n", "________", "_________", "_________");

        for (Persona p : llista) {
            System.out.printf("%-10s %-18s \t%-10s %n", p.getNom(), p.getCognom(), p.getDNI());
        }

    }

    private void mostrarNomAZ() {

        List<Persona> llista = gestio.getDatafromCSV();

        ComparadorNomAZ nomAZ = new ComparadorNomAZ();
        llista.sort(nomAZ);

        printData(llista);

    }
    private void mostrarNomZA() {

        List<Persona> llista = gestio.getDatafromCSV();

        ComparadorNomZA nomZA = new ComparadorNomZA();
        llista.sort(nomZA);

        printData(llista);

    }

    private void mostrarCognomAZ() {

        List<Persona> llista = gestio.getDatafromCSV();

        ComparadorCognomAZ cognomAZ = new ComparadorCognomAZ();
        llista.sort(cognomAZ);

        printData(llista);

    }

    private void mostrarCognomZA() {

        List<Persona> llista = gestio.getDatafromCSV();

        ComparadorCognomZA cognomZA = new ComparadorCognomZA();
        llista.sort(cognomZA);

        printData(llista);

    }

    private void mostrarDNI19() {

        List<Persona> llista = gestio.getDatafromCSV();

        ComparadorDNI19 dni19 = new ComparadorDNI19();
        llista.sort(dni19);

        printData(llista);

    }

    private void mostrarDNI91() {

        List<Persona> llista = gestio.getDatafromCSV();

        ComparadorDNI91 dni91 = new ComparadorDNI91();
        llista.sort(dni91);

        printData(llista);

    }

}
