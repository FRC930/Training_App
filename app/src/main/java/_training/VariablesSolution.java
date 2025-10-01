package _training;

public class VariablesSolution {
    public static void main(String[] args) {
        int myNum = 1;
        int myOtherNum = 2;
        int myNum3 = 5;

        int myFinalNum = (myNum + myOtherNum) * myNum3;

        System.out.println(myFinalNum);

        String myText = "Hello! ";
        String myOtherText = "Again!";
        String myFinalText = myText + myOtherText;

        System.out.println(myFinalText);

        float myDecimal = 2.5f;
        float mySecondDecimal = 5.0f;

        float myLastDecimal = myDecimal / mySecondDecimal;
        
        System.out.println(myLastDecimal);

        double myDoubleDecimal = 6.7;
        double myOtherDouble = 4.1;

        double myFinalDouble = myDoubleDecimal / myOtherDouble;

        System.out.println(myFinalDouble);

        boolean ateBreakfast = true;
        boolean ateLunch = true;
        boolean ateDinner = false;

        System.out.println(ateBreakfast && ateLunch);
        System.out.println(ateLunch && ateDinner);
        
    }
}
