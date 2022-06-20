package n3ex1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestioFitxer {

    public void introduirPersona(Persona persona) throws IOException {

        String fileName = "resources/persones.csv";

        try (FileOutputStream file = new FileOutputStream(fileName, true);
             OutputStreamWriter out = new OutputStreamWriter(file);
             BufferedWriter buf = new BufferedWriter(out);
             PrintWriter writer = new PrintWriter(buf)) {

            writer.print(persona.getNom());
            writer.print(",");
            writer.print(persona.getCognom());
            writer.print(",");
            writer.print(persona.getDNI());
            writer.println();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Persona> getDatafromCSV() {

        List<Persona> llista = new ArrayList<>();

        try {
            String inputFile = "resources/persones.csv";
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                llista.add(new Persona(line.split(",")[0], line.split(",")[1], line.split(",")[2]));
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return llista;

    }

}
