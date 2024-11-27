package _training;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i+= 2) {
            System.out.println("I ran in " + i + " circles today!");
        }
        for (int i = 1; i < 100; i+= 2) {
            System.out.println("I ran in " + i + " circles today!");
        }

        int odd = 1;
        for (int i = 1; i <=100; i++) {
            //if odd is equal 1 then it would run this code 
            if (odd == 1) {
                //(modular)divides i by 2 and if remandier is 1 it would be odd
                if (i % 2 ==1){
                    //prints out all odd numbers if there is a remandir of 1 
                    System.out.println("odd"+i);  
                
                }
            }
            // otherwise print for even
            else{
                //(modular)divides i by 2 and if remandier is 0 then would be even  
                if (i % 2 == 0) {
                    //if the remadier is 0 then print out all even numbers
                    System.out.println("even"+i);
                }
            }
        }
    }
}
