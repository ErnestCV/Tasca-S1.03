package n1ex3;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //Llegir el fitxer i guardar les dades a un HashMap
        HashMap<String, String> mapa = new HashMap<>();

        try {
            String inputFile = "resources/countries.txt";
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                mapa.put(line.split(" ")[0], line.split(" ")[1]);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        //Començar el joc

        //Creem una llista el nom dels països i inicialitzem un objecte Random
        String[] llista = mapa.keySet().toArray(new String[0]);
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el nom d'usuari:");
        String nom = scanner.next();

        int puntuacio = 0;
        int i = 0;

        while (i < 10) {
            //Trobem un element aleatori de la llista de països i el mostrem
            int randomIndex = random.nextInt(llista.length);
            String randomValue = llista[randomIndex];
            System.out.println("País: " + randomValue);

            //Demanem la capital corresponent al país mostrat
            System.out.println("Capital: ");
            String capital = scanner.next();

            //Comprovem si l'encerta
            if (capital.equals(mapa.get(randomValue))) {
                puntuacio++;
                System.out.println("Correcte!");
            } else {
                System.out.println("Incorrecte :(");
            }

            i++;
        }

        //Creem un fitxer i afegim els resultats
        String outputFileName = "resources/classificacio.txt";
        try (BufferedWriter outputFile = new BufferedWriter(new FileWriter(outputFileName, true))) {
            outputFile.write("Usuari: " + nom + " - Puntuació: " + puntuacio + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
