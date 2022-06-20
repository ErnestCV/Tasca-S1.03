package n3ex1;

import java.io.*;
import java.util.Scanner;

public class GestioFitxer {

    public void introduirPersona(Persona persona) throws IOException {

        String fileName = "resources/persones.csv";

        try (FileOutputStream file = new FileOutputStream(fileName);
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

}
