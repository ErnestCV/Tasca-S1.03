package n2ex2;

import n2ex1.Restaurant;

import java.util.Comparator;

public class PuntuacioCompare implements Comparator<Restaurant> {

    //Comparador per puntuacions
    public int compare(Restaurant r1, Restaurant r2){
        return r2.getPuntuacio() - r1.getPuntuacio();
    }

}
