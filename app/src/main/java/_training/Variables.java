package _training;

public class Variables {
    public static void main(String[] args) {
        int myNum = 1;
        int myOtherNum = 2;
        int myOtherOtherNum = 3;

        // Get the sum of the two numbers
        int myFinalNum = (myNum + myOtherNum) * myOtherOtherNum;
        System.out.println(myFinalNum);
        
        // String Variable
        String myText = "Hello! ";
        String myOtherText = "Again!";

        String myFinalText = myText + myOtherText;
        System.out.println(myFinalText);

        // Float Variable
        float myDecimal = 2.5f;
        float mySecondDecimal = 5.0f;

        float myLastDecmial = myDecimal / mySecondDecimal;
        System.out.println(myLastDecmial);

        // Doubles
        double myDoubleDecimal = 6.7;
        double myOtherDouble = 4.1;

        double myFinalDouble = myDoubleDecimal / myOtherDouble;
        System.out.println(myFinalDouble);

        // Boolean
        Boolean ateBreckfast = true;
        Boolean ateLunch = true;
        Boolean ateDinner = false;

        System.out.println(ateBreckfast && ateLunch);
        System.out.println(ateLunch && ateDinner);
    }
}
