package _training;

public class Parameters {
    static void multiplication(int num, int num2){
        System.out.println(num*num2);
    
    }

    static void multiplyDecimals(double num, double num2){
            System.out.println(num*num2);


    }
    static void division(int num, int num2){
        System.out.println(num/num2);

  
    }

    public static void main(String[] args){
        multiplication(3, 4);

        multiplyDecimals(3.2, 2.5);

        division(4, 2);
    }
}
