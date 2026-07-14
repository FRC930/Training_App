package _training;

public class Parameters {
    static void multiply(int num, int numTwo){
        System.out.println(num*numTwo);
    }
    static void multiplyDecimals(double numDoubleOne, double numDoubleTwo){
        System.out.println(numDoubleOne*numDoubleTwo);
    }

    public static void main(String[] args){
        multiply(3, 2);
        multiply(5,2);
        multiply(10,2);

        int myNum = 5;
        int myNum2 = 10;

        multiply(myNum, myNum2);
        multiplyDecimals(2.3, 6.1);



    }
}
