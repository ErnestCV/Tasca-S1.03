package n1ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Month> mesosArray = new ArrayList<>();

        mesosArray.add(new Month("Gener"));
        mesosArray.add(new Month("Febrer"));
        mesosArray.add(new Month("Març"));
        mesosArray.add(new Month("Abril"));
        mesosArray.add(new Month("Maig"));
        mesosArray.add(new Month("Juny"));
        mesosArray.add(new Month("Juliol"));

        mesosArray.add(new Month("Setembre"));
        mesosArray.add(new Month("Octubre"));
        mesosArray.add(new Month("Novembre"));
        mesosArray.add(new Month("Desembre"));

        //Afegim el mes d'agost, índex 7
        mesosArray.add(7, new Month("Agost"));

        //Comprovem que l'array manté l'ordre

        mesosArray.forEach(System.out::println);

        //Convertim a un hashSet
        HashSet<Month> mesosHashSet = new HashSet<>(mesosArray);

        //Comprovem que no hi ha duplicats
        mesosHashSet.add(new Month("Gener"));
        System.out.println(mesosHashSet.size()); //Segueix sent 12

        //Recorrem amb for
        for (Month mes : mesosArray) {
            System.out.println(mes);
        }

        System.out.println();

        //Recorrem amb iterador
        Iterator<Month> iterador = mesosArray.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

    }

}
