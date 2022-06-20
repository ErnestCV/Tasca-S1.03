package n2ex2;

import n2ex1.Restaurant;

import java.util.Comparator;

public class NomCompare implements Comparator<Restaurant> {

    public int compare(Restaurant r1, Restaurant r2){
        return r1.getNom().compareTo(r2.getNom());
    }

}
