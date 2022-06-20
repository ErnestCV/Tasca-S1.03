package n3ex1;

import java.io.IOException;
import java.util.Scanner;

public class Arxiu {

    private static GestioFitxer gestio;
    private final Scanner scanner = new Scanner(System.in);

    public Arxiu() {
        gestio = new GestioFitxer();
    }

    public void iniciar(){
        boolean exit = false;

        do {
            switch (menu()) {
                //Introduir persona
                case 1 -> introduirPersona();

//                //Mostrar les butaques reservades per una persona
//                case 2 -> mostrarButaquesPersona();
//
//                //Reservar una butaca
//                case 3 -> reservarButaca();
//
//                //Anul·lar la reserva d'una butaca
//                case 4 -> anularReserva();
//
//                //Anul·lar totes les reserves d'una persona
//                case 5 -> anularReservaPersona();

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

    public void introduirPersona(){

        System.out.println("Introdueix el nom:");
        String nom = scanner.next();
        System.out.println("Introdueix el cognom:");
        String cognom = scanner.next();
        System.out.println("Introdueix el DNI:");
        String dni = scanner.next();

        try {
            gestio.introduirPersona(new Persona(nom, cognom, dni));
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
