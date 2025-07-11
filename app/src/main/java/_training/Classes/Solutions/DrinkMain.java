package _training.Classes.Solutions;

import com.google.common.collect.ForwardingNavigableSet;

public class DrinkMain {

    static void printDrink(Drink drink){
        System.out.println("acid " + drink.getColor());
        System.out.println("bitterness " + drink.getbitterness());
        System.out.println("bubbles " + drink.getfizzy());
    }

    public static void main(String[] args){
        Drink soda = new Drink("green",1000, true);

        printDrink(soda);

        Drink lemonade = new Drink("yellow",20, false);
        
       printDrink(lemonade);
    }
}