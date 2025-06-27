package _training;

public class Parameters {
    static void multiply(int num1, int num2){
        System.out.println(num1*num2);
    }
    static void multiplyDecimals(float num3, float num4) {
        System.out.println(num3*num4);
    }

    public static void main(String[] args){
        multiply(3,6);
        multiply(5,8);
        multiply(10,7);

        int myNum1 = 3;
        int myNum2 = 8;

        multiply(myNum1, myNum2);

        float myFloat1 = 4.5f;
        float myFloat2 = 4.5f;

        multiplyDecimals(myFloat1, myFloat2);
    }
}
