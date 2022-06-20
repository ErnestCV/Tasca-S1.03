package n2ex1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Restaurant 1", 3));
        restaurants.add(new Restaurant("Restaurant 1", 3)); //Element repetit
        restaurants.add(new Restaurant("Restaurant 1", 4));
        restaurants.add(new Restaurant("Restaurant 2", 5));

        System.out.println(restaurants.size()); //Ha de ser 3
        System.out.println(restaurants); //Comprovem que no hi ha elements amb nom i puntuació repetida

    }

}
