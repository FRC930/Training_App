package _training;

//Checked in by Chase Reinders
public class Variables {
    public static void main(String[] args) {
        int myNum;
        myNum = 1;
        int myOtherNum = 2;
        int myThirdNum = 3;
        // Get he sum of the two numbers
        int myFinalNum = myNum * myOtherNum;
        System.out.println(myFinalNum);
        myFinalNum = myFinalNum * myThirdNum;
        System.out.println(myFinalNum);
        String myText = "hellow";
        String myOtherText = " world!";
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
