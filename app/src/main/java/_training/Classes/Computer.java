package _training.Classes;

public class Computer {

    String prevAction;

    public int add(int x, int y) {
        prevAction = "add";
        return x + y;
    }

    public int subtract(int x, int y) {
        prevAction = "sub";
        return x - y;
    }

    // TODO: Add multiplication (mul) & division (div)
}