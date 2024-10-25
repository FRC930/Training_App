package _training;

public class Variables {
    public static void main(String[] args) {
        int myNum = 1;
        int myOtherNum = 2;
        int mynum3 = 3;

        // Get the sum of the two numbers
        int myFinalNum = (myNum + myOtherNum) * mynum3;
        System.out.println(myFinalNum);
        
        String myText = "Hello! ";
String myOtherText = "Again!";
    String myFinalText = myText + myOtherText;
    System.out.println(myFinalText);
    
    float myDecimal = 2.5f;
    float mySecondDecimal = 5.0f;
    float myFinalDecimal = myDecimal / mySecondDecimal;
    System.out.println(myFinalDecimal);

    boolean ateBreakfast = true;
 boolean ateLunch = true;
 boolean ateDinner = false;

 System.out.println(ateBreakfast && ateLunch);
 System.out.println(ateLunch && ateDinner);
    }   
    
    

}
