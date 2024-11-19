package _training;

public class For {
    public static void main(String[] args) {
        for (int i = 20; i > 0; i--)  {
            System.out.println("I ran in " + i + " circles today!");
                for (int quarters = 4; quarters > 0; quarters--) {
                System.out.println("I have ran in " + quarters + " quarters of the " + i +" circle!");
            }
        }
    }
}
