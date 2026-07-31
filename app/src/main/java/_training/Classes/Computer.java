package _training.Classes;

public class Computer {

    String prevAction;
    int operationsRan = 0;

    public int add(int x, int y) {
        prevAction = "add";
        operationsRan++;
        return x + y;
    }

    public int subtract(int x, int y) {
        prevAction = "sub";
        operationsRan++;
        return x - y;
    }
    
     public int multiply(int x, int y) {
        prevAction = "multiply";
        operationsRan++;
        return x * y;
    }
    public void printAdd(int x, int y) {
        System.out.println(this.subtract(x,y));
    }
    // TODO: Add multiplication (mul) & division (div)
}