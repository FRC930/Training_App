package _training;

public class printforloops {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 100; i += 2) {
            //i is equal to 0. then it will add 2 and if the number that it gets is less then 100 it will add 2 again and keep going till it hits 100
            System.out.print(i + " ");
            // the " " adds a space inbetween the numbers so its not all smashed to gether
        }





        boolean f = !true; //Creates a flag.
        for (int i = 0; i <=100; i++){ // Adds one untill i reaches 100.
            //Even.
            
            // % is a mod, wich is dividing and returning the remander.
            // When finding a odd or even you mod by 2. if the answer is equal to 0 then it's even, if not odd.
            if ((f) && ((i % 2) == 0)) { // If f is true, then print even.
                System.out.println(i + " ");
            }
            //Odd.
                else if (!f && ((i % 2) == 1)){ // If f is not true then prints odd.
                System.out.println(i + " ");// Prints the number.
            }
        }    
    }       
}           
