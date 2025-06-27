package _training;

public class Parameters {
    static void multiply(int num, int num2){
        System.out.println(num*num2);
    }
static void multiplydecimals(double num, double num2){
    System.out.println(num*num2);
}
    public static void main(String[] args){
        multiply(3,6);
        multiply(2,9);
        multiply(10,9);

        int mynum = 8;
        int mynum2 = 5;
        multiply(mynum, mynum2);

        multiplydecimals(2.3,6.1);
    }
}
