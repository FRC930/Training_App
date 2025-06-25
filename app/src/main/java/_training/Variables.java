package _training;

public class Variables {
    public static void main(String[] args) {
        int myNum = 1;
        int myOtherNum = 2;
        int mychange = 5;
        // Get the sum of the two numbers
        int myFinalNum = (myNum + myOtherNum)*mychange;
        System.out.println(myFinalNum);
       // String
        String myText = "Hello! ";
        String myOtherText = "Again!";
        String myFinalText = myText + myOtherText;
        System.out.println(myFinalText);
        // Float
        float myDecimal = 2.5f;
        float mySecondDecimal = 5.0f;
        float myLastDecimal = myDecimal / mySecondDecimal;
        System.out.println(myLastDecimal);
        // Bool
        boolean ateBreakfast = true;
        boolean ateLunch = true;
        boolean ateDinner = false;
        System.out.println(ateBreakfast && ateLunch);
        System.out.println(ateLunch && ateDinner);
    }
}
   