package _training.Classes.Solutions;

public class Drink {
    private String color;
    private int bitterness; // Out of 10
    private boolean fizzy;
    // constructer
    Drink(String color, int bitterness, boolean fizzy){
        this.color = color;
        this.bitterness = bitterness;
        this.fizzy = fizzy;
        System.out.println("The drink looks "+color+"!");
    }

    // END OF Properties & Constructors SECTION
    String getColor(){
        return this.color;
    }

    int getbitterness(){
        return this.bitterness;
    }

    boolean getfizzy(){
        return this.fizzy;
    }
    
}