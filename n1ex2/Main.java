package n1ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<Integer> llista1 = new ArrayList<>();

        llista1.add(1);
        llista1.add(2);
        llista1.add(3);
        llista1.add(4);

        List<Integer> llista2 = new ArrayList<>();

        ListIterator<Integer> iterador = llista1.listIterator(llista1.size());

        while (iterador.hasPrevious()){
            llista2.add(iterador.previous());
        }

        llista2.forEach(System.out::println); //Comprovem que és la primera llista en ordre invers

    }

}
