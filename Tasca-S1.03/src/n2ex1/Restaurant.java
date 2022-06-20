package n2ex1;

import java.util.Objects;

public class Restaurant {

    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    @Override
    public boolean equals(Object o){

        if (o == this) return true;
        if (!(o instanceof Restaurant)){
            return false;
        }
        Restaurant restaurant = (Restaurant) o;
        return Objects.equals(nom, restaurant.nom) & Objects.equals(puntuacio, restaurant.puntuacio);

    }

    @Override
    public int hashCode(){
        return Objects.hash(puntuacio) * Objects.hash(nom);
    }

    @Override
    public String toString(){
        return "Nom: " + this.nom + " - Puntuació: " + this.puntuacio;
    }
}
