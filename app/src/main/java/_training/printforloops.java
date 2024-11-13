package _training;

public class printforloops {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 100; i += 2) {
            //i is equal to 0. then it will add 2 and if the number that it gets is less then 100 it will add 2 again and keep going till it hits 100
            System.out.print(i + " ");
            // the " " adds a space inbetween the numbers so its not all smashed to gether
        }




        
        boolean f = !true; //creates a flag
        for (int i = 0; i <=100; i++){ // adds one intill i reaches 100
            //even
            if ((f) && ((i % 2) == 0)) { // if f is true then print even
                System.out.println(i + " ");
            }
            //odd
                else if (!f && ((i % 2) == 1)){ // if f is not true then prints odd
                System.out.println(i + " ");// prints the number
            }
        }   // % is a mod, wich dividing.
    }
}
