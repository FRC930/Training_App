package _training.Classes;

public class Drink2 {
    public static void main(String[] args) {
        Drink DrPepper = new Drink("red", 5, 5.87f);
        DrPepper.taste(8);
        System.out.println(DrPepper.gettaste());
    }
}
