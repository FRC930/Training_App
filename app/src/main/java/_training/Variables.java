package _training;

public class Variables {
    public static void main(String[] args) {
        int myNum = 1;
        int myOtherNum = 2;
        int myNum3 = 3;

        double doubleNumber = 1.6;
        double otherDoubleNumber = 1.3;

        int total = (int) (doubleNumber + otherDoubleNumber);
        System.out.println(total);

        // Get the sum of the two numbers
        int myFinalNum = myNum3 * (myNum + myOtherNum);
        System.out.println(myFinalNum);
    }
}
