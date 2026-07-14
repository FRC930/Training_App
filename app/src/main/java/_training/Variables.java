package _training;

import java.nio.file.attribute.AttributeView;

public class Variables {
    public static void main(String[] args) {
        int myNum = 1;
        int myOtherNum = 2;
        int mythirdNum = 3;

        // Get the sum of the two numbers
        int myFinalNum = myNum + myOtherNum;
        myFinalNum = myFinalNum * mythirdNum;
        System.out.println(myFinalNum);

        // String variables
        String myText = "Hello!";
        String myOtherText = "Again!";
        String myFinalText = myText + myOtherText;
        System.out.println(myFinalText);

        //Float variables
        float myDecimal = 2.5f;
        float mySecondDecimal = 5.0f;
        float myLastDecimal = myDecimal / mySecondDecimal;
        System.out.println(myLastDecimal);
        
        //Double float variable
        double myDoubleDecimal = 6.7;
        double myOtherDouble = 4.1;
        double myFinalDouble = myDoubleDecimal / myOtherDouble;
        System.out.println(myFinalDouble);

        //Boolean variables
        boolean ateBreakfast = true;
        boolean ateLunch = true;
        boolean ateDinner = false;
        System.out.println(ateBreakfast && ateLunch);
        System.out.println(ateLunch && ateDinner);

    int numOne = 1;
    int numTwo = 2;
    int numAnswer = numOne + numTwo;
    System.out.println(numAnswer);

    float numFloatOne = 1.0f;
    float numFloatTwo = 2.0f;
    float numFloatAnswer = numFloatOne + numFloatTwo;
    System.out.println(numFloatAnswer);

    double numDoubleOne = 1.0;
    double numDoubleTwo = 2.0;
    double numDoubleAnswer = numDoubleOne + numDoubleTwo;
    System.out.println(numDoubleAnswer);
    
    int subIntAnswer = numTwo - numOne;
    System.out.println(subIntAnswer);
    float subFloatAnswer = numFloatTwo  - numFloatOne;
    System.out.println(subFloatAnswer);
    double subDoubleAnswer = numDoubleTwo - numDoubleOne;
    System.out.println(subDoubleAnswer);

    System.out.println(numOne * numTwo);
    System.out.println(numFloatOne * numFloatTwo);
    System.out.println(numDoubleTwo * numDoubleOne);

    System.out.println(numTwo / numOne);
    System.out.println(numFloatTwo / numFloatOne);
    System.out.println(numDoubleTwo / numDoubleOne);
    
    }
}
