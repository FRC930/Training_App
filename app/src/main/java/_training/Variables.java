package _training;

public class Variables {
    public static void main(String[] args) {
        // Integers
        int myNum = 1;
        int myOtherNum = 2;
        int myOtherOtherNum = 5;

        int myFinalNum = (myNum + myOtherNum) * myOtherOtherNum;;
        System.out.println(myFinalNum);

        // Strings
        String myText = "Hello! ";
        String myOtherText = "Again!";

        String myFinalText = myText + myOtherText;
        System.out.println(myFinalText);

        // Floats
        float myDecimal = 2.5f;
        float mySecondDecimal = 5.0f;

        float myLastDecimal = myDecimal / mySecondDecimal;
        System.out.println(myLastDecimal);

        // Doubles
        double myDoubleDecimal = 6.7;
        double myOtherDouble = 4.1;

        double myFinalDouble = myDoubleDecimal / myOtherDouble;
        System.out.println(myFinalDouble);

        // Bools
        boolean ateBreakfast = true;
        boolean ateLunch = true;
        boolean ateDinner = false;

        System.out.println(ateBreakfast && ateLunch);
        System.out.println(ateLunch && ateDinner);

    }
}
