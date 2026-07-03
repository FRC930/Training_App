package _training;

public class Variables {
    public static void main(String[] args) {
        int myNum = 1;
        int myOtherNum = 0;
        int myOtherNum_one = 2;

        // Get the sum then product of the two numbers
        int myFinalNum = (myNum + myOtherNum) / myOtherNum_one;
        System.out.println(myFinalNum);
        String myText = "Hello! ";
        String myOtherText = "Again!";
        String myFinalText = myText + myOtherText;
        System.out.println(myFinalText);
        float myDecimal = 2.5f;
        float mySecondDecimal = 5.0f;
        float myLastDecimal = myDecimal / mySecondDecimal;
        System.out.println(myLastDecimal);
        boolean ateBreakfast = true;
        boolean ateLunch = true;
        boolean ateDinner = false;
        System.out.println(ateBreakfast && ateLunch);
        System.out.println(ateLunch && ateDinner);
    }
}
