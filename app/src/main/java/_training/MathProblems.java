package _training;

public class MathProblems {
    static void Int(int myNum, int myNum2, int myMinusNum, int MinusNum2, int myMultiNum, int MultiNum2, int DiviNum, int DiviNum2){
        System.out.println(myMinusNum-myMinusNum2);
        System.out.println(myNum+myNum2);
        System.out.println(myMultiNum*myMultiNum2);
        System.out.println(myDiviNum/myDiviNum2);
    }
    static void Float(float myFloatNum, float myFloatNum2, float myMinusFloatNum, float myMinusFloatNum2, float myMultiFloatNum, float myMultiFloatNum2, float myDiviFloatNum, float myDiviFloatNum2){
        System.out.println(myMinusFloatNum-myMinusFloatNum2);
        System.out.println(myFloatNum+myFloatNum2);
        System.out.println(myMultiFloatNum+myMultiFloatNum2);
        System.out.println(myDiviFloatNum/myDiviFloatNum2);
    }
    static void Double(double myDoubleNum, double myDoubleNum2, double myMinusDoubleNum, double myMinusDoubleNum2, double myMultiDoubleNum, double myMultiDoubleNum2, double myDiviDoubleNum, double myDiviDoubleNum2){
        System.out.println(myMinusDoubleNum-myMinusDoubleNum2);
        System.out.println(myDoubleNum+myDoubleNum2);
        System.out.println(myMultiDoubleNum+myMultiDoubleNum2);
        System.out.println(myDiviDoubleNum/myDiviDoubleNum2);
    }
    static void addInt(int myNum, int myNum2){
        System.out.println(myNum+myNum2);
    }
    static void subInt(int myMinusNum, int myMinusNum2){
        System.out.println(myMinusNum+myMinusNum2);
    }
    static void multiInt(int myMultiNum, int myMultiNum2){
        System.out.println(myMultiNum+myMultiNum2);
    }
    static void diviInt(int myDiviNum, int myDiviNum2){
        System.out.println(myDiviNum+myDiviNum2);
    }
    static void addFloat(float myFloatNum, float myFloatNum2){
        System.out.println(myFloatNum+myFloatNum2);
    }
    static void subFloat(float myMinusFloatNum, int myMinusFloatNum2){
        System.out.println(myMinusFloatNum+myMinusFloatNum2);
    }
    static void multiFloat(float myMultiFloatNum, float myMultiFloatNum2){
        System.out.println(myMultiFloatNum+myMultiFloatNum2);
    }
    static void diviFloat(float myDiviFloatNum, float myDiviFloatNum2){
        System.out.println(myDiviFloatNum+myDiviFloatNum2);
    }
    static void addDouble(double myDoubleNum, double myDoubleNum2){
        System.out.println(myDoubleNum+myDoubleNum2);
    }
    static void subDouble(double myMinusDoubleNum, double myMinusDoubleNum2){
        System.out.println(myMinusDoubleNum+myMinusDoubleNum2);
    }
    static void multiDouble(double myMultiDoubleNum, double myMultiDoubleNum2){
        System.out.println(myMultiDoubleNum+myMultiDoubleNum2);
    }
    static void diviDouble(double myDiviDoubleNum, double myDiviDoubleNum2){
        System.out.println(myDiviDoubleNum+myDiviDoubleNum2);
    }
    public static void main(String[] args){
        Int(1,2,1,2,1,2,1,2);
    
        int myNum = 1;
    int myNum2 = 2;
    int myMinusNum = 1;
    int myMinusNum2 = 2;
    int myMultiNum = 1;
    int myMultiNum2 = 2;
    int myDiviNum = 1;
    int myDiviNum2 = 2;
    float myFloatNum = 1;
    float myFloatNum2 = 2;
    float myMinusFloatNum = 1;
    float myMinusFloatNum2 = 2;
    float myMultiFloatNum = 1;
    float myMultiFloatNum2 = 2;
    float myDiviFloatNum = 1;
    float myDiviFloatNum2 = 2;
    double myDoubleNum = 1;
    double myDoubleNum2 = 2;
    double myMinusDoubleNum = 1;
    double myMinusDoubleNum2 = 2;
    double myMultiDoubleNum = 1;
    double myMultiDoubleNum2 = 2;
    double myDiviDoubleNum = 1;
    double myDiviDoubleNum2 = 2; 

    int myFinalNum = (myNum + myNum2);
    int myFinalMinusNum = (myMinusNum - myMinusNum2);
    int myFinalMultiNum = (myMultiNum * myMultiNum2);
    int myFinalDiviNum = (myDiviNum / myDiviNum2);
    float myFinalFloatNum = (myFloatNum + myFloatNum2);
    float myFinalMinusFloatNum = (myMinusFloatNum - myMinusFloatNum2);
    float myFinalMultiFloatNum = (myMultiFloatNum * myMultiFloatNum2);
    float myFinalDiviFloatNum = (myDiviFloatNum / myDiviFloatNum2);
    double myFinalDoubleNum = (myDoubleNum + myDoubleNum2);
    double myFinalMinusDoubleNum = (myMinusDoubleNum - myMinusDoubleNum2);
    double myFinalMultiDoubleNum = (myMultiDoubleNum * myMultiDoubleNum2);
    double myFinalDiviDoubleNum = (myDiviDoubleNum / myDiviDoubleNum2);
    
    System.out.println ("");

    System.out.println ("ADDITION");
    System.out.println ("int = " + myFinalNum);
    System.out.println ("Double = " + myFinalDoubleNum);
    System.out.println ("Float = " + myFinalFloatNum);
    
    System.out.println ("");

    System.out.println ("MINUS");
    System.out.println ("int Minus = " + myFinalMinusNum);
    System.out.println ("Float Minus = " + myFinalMinusFloatNum);
    System.out.println ("Double Minus = " + myFinalMinusDoubleNum);
    
    System.out.println ("");

    System.out.println ("MULTIPLY");
    System.out.println ("int Multiply = " + myFinalMultiNum);
    System.out.println ("Float Multiply = " + myFinalMultiFloatNum);
    System.out.println ("Double Multiply = " + myFinalMultiDoubleNum);
    
    System.out.println ("");

    System.out.println ("DIVIDE");
    System.out.println ("int Divide = " + myFinalDiviNum);
    System.out.println ("Float Divide = " + myFinalDiviFloatNum);
    System.out.println ("Double Divide = " + myFinalDiviDoubleNum);
    
    System.out.println ("");
    }
}
