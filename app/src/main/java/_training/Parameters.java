package _training;

public class Parameters {
    static void multiply(int num, int num2){
        System.out.println(num*num2);
    }
    static void multiplyDecimals(double num, double num2){
        System.out.println(num*num2);
    }
    public static void main(String[] args){
        multiply(19, 39);
        multiply(42, 21);
        multiply(67, 14);

        int myNum = 14;
        int myNum2 = 76;
        multiply(myNum, myNum2);

        multiplyDecimals(2.3, 6.1);
    }
}
