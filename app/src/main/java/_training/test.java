package _training;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i+= 2) {
            System.out.println("I ran in " + i + " circles today!");
        }
        for (int i = 1; i < 100; i+= 2) {
            System.out.println("I ran in " + i + " circles today!");
        }
        for (int i = 1; i <=100; i++) {
            if (i % 2 == 0) {
                System.out.println("even"+i);
                //even
            } else {
                System.out.println("odd"+i);
                //odd
            }
        }
    }
}
