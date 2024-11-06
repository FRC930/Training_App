package _training;

public class MathProblems {
    static int addInt(int myNum, int myNum2){
        System.out.println(myNum+myNum2);
        return myNum + myNum2;
    }
    static int subInt(int myMinusNum, int myMinusNum2){
        System.out.println(myMinusNum+myMinusNum2);
        return myMinusNum - myMinusNum2;
    }
    static int multiInt(int myMultiNum, int myMultiNum2){
        System.out.println(myMultiNum+myMultiNum2);
        return myMultiNum * myMultiNum2;
    }
    static int diviInt(int myDiviNum, int myDiviNum2){
        System.out.println(myDiviNum+myDiviNum2);
        return myDiviNum / myDiviNum2;
    }
    static float addFloat(float myFloatNum, float myFloatNum2){
        System.out.println(myFloatNum+myFloatNum2);
        return myFloatNum + myFloatNum2;
    }
    static float subFloat(float myMinusFloatNum, int myMinusFloatNum2){
        System.out.println(myMinusFloatNum+myMinusFloatNum2);
        return myMinusFloatNum - myMinusFloatNum2;
    }
    static float multiFloat(float myMultiFloatNum, float myMultiFloatNum2){
        System.out.println(myMultiFloatNum+myMultiFloatNum2);
        return myMultiFloatNum * myMultiFloatNum2;
    }
    static float diviFloat(float myDiviFloatNum, float myDiviFloatNum2){
        System.out.println(myDiviFloatNum+myDiviFloatNum2);
        return myDiviFloatNum / myDiviFloatNum2;
    }
    static double addDouble(double myDoubleNum, double myDoubleNum2){
        System.out.println(myDoubleNum+myDoubleNum2);
        return myDoubleNum + myDoubleNum2;
    }
    static double subDouble(double myMinusDoubleNum, double myMinusDoubleNum2){
        System.out.println(myMinusDoubleNum+myMinusDoubleNum2);
        return myMinusDoubleNum - myMinusDoubleNum2;
    }
    static double multiDouble(double myMultiDoubleNum, double myMultiDoubleNum2){
        System.out.println(myMultiDoubleNum+myMultiDoubleNum2);
        return myMultiDoubleNum * myMultiDoubleNum2;
    }
    static double diviDouble(double myDiviDoubleNum, double myDiviDoubleNum2){
        System.out.println(myDiviDoubleNum+myDiviDoubleNum2);
        return myDiviDoubleNum / myDiviDoubleNum2;
    }
    public static void main(String[] args){
    addInt(1,2);
    subInt(1,2);
    multiInt(1,2);
    diviInt(1,2);
    addFloat(1,2);
    subFloat(1,2);
    multiFloat(1,2);
    diviFloat(1,2);
    addDouble(1,2);
    subDouble(1,2);
    multiDouble(1,2);
    diviDouble(1,2);
    
    System.out.println ("");

    System.out.println ("ADDITION");
    System.out.println ("int = " + addInt(1,2));
    System.out.println ("Double = " + addDouble(1,2));
    System.out.println ("Float = " + addFloat(1,2));
    
    System.out.println ("");

    System.out.println ("MINUS");
    System.out.println ("int Minus = " + subInt(1,2));
    System.out.println ("Float Minus = " + subFloat(1,2));
    System.out.println ("Double Minus = " + subDouble(1,2));
    
    System.out.println ("");

    System.out.println ("MULTIPLY");
    System.out.println ("int Multiply = " + multiInt(1,2));
    System.out.println ("Float Multiply = " + multiFloat(1,2));
    System.out.println ("Double Multiply = " + multiDouble(1,2));
    
    System.out.println ("");

    System.out.println ("DIVIDE");
    System.out.println ("int Divide = " + diviInt(1,2));
    System.out.println ("Float Divide = " + diviFloat(1,2));
    System.out.println ("Double Divide = " + diviDouble(1,2));
    
    System.out.println ("");
    }
}
