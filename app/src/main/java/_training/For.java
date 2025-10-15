package _training;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 68; i++) {
            for (int quarters = 0; quarters < 5; quarters++){
                System.out.println("I ran in " + quarters + " quarters of the " + i + " Circle!");
            }
            System.out.println("I ran in " + i + " circles today!");
        }
    }
}
