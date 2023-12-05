package Model;

import java.util.Arrays;

public class Jugador {

    private String name;
    private Card[]cards;

    public Jugador(String name , int tam ){
        if (tam<=1){
            tam=2;
        }
        this.cards = new Card[tam];
    }
    public Jugador(){
        this("Generico",2);
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }
}
