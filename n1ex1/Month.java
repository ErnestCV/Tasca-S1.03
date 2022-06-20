package n1ex1;

import java.util.Objects;

public class Month {

    private String month;

    public Month(String month) {

        this.month = month;

    }

    //Ens assegurem que no s'hi poden afegir nous objectes amb els atributs d'un objecte que ja existeixi a un HashSet
    @Override
    public boolean equals(Object o){

        if (o == this) return true;
        if (!(o instanceof Month)){
            return false;
        }
        Month mes = (Month) o;
        return Objects.equals(month, mes.month);

    }

    @Override
    public int hashCode(){
        return Objects.hash(month);
    }

    @Override
    public String toString() {
        return "Mes: " + this.month;
    }
}