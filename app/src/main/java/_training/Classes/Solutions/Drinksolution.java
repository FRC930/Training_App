package _training.Classes.Solutions;

public class Drinksolution {
    public String color;
    public int bitterness; // Out of 10
    public boolean fizzy;
    Drinksolution(String color, int bitterness, boolean fizzy){
        this.color = color;
        this.bitterness = bitterness;
        this.fizzy = fizzy;
        System.out.println("The drink looks "+color+"!");
    }
}
