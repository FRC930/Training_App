package _training;

public class Parameters {
    static void multiplyDecimals(double num, double num2){
        System.out.println(num*num2);
    }
    static int square(int num, int num2){
        return (num*num2);
    }

    public static void main(String[] args){
        multiplyDecimals(2.3,6.1);
        multiplyDecimals(5.4,2.9);
        multiplyDecimals(10.2,28.3);
        double result = square(2, 3);
        System.out.println(result);
    }
}
