package n2ex2;

import n2ex1.Restaurant;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Restaurant 1", 3));
        restaurants.add(new Restaurant("Restaurant 1", 3)); //Element repetit
        restaurants.add(new Restaurant("Restaurant 1", 4));
        restaurants.add(new Restaurant("Restaurant 1", 5));
        restaurants.add(new Restaurant("Restaurant 2", 2));
        restaurants.add(new Restaurant("Restaurant 2", 5));
        restaurants.add(new Restaurant("Restaurant 3", 1));

        System.out.println("Ordenem per nom i puntuació ascendent:");
        PuntuacioCompare puntuacioCompare = new PuntuacioCompare();
        NomCompare nomCompare = new NomCompare();
        Comparator<Restaurant> comparador = nomCompare.thenComparing(puntuacioCompare);
        //Comparator<Restaurant> comparador = Comparator.comparing(Restaurant::getNom).thenComparing(Restaurant::getPuntuacio); //No compara en ordre ascendent

        List<Restaurant> list = new ArrayList<>(restaurants);
        Collections.sort(list, comparador);

        list.forEach(System.out::println);

    }

}
