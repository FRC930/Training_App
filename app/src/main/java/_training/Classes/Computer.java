package _training.Classes;

public class Computer {

    protected int computationsrun;
    protected int manufacturedYear;
    String prevAction;

    public int add(int x, int y) {
        computationsrun++;
        prevAction = "add";
        return x + y;
    }

    public int subtract(int x, int y) {
        computationsrun++;
        prevAction = "sub";
        return x - y;
    }
    
    public void printAdd(int x, int y) {
        System.out.println(this.add(x,y));
    }
    

    // TODO: Add multiplication (mul) & division (div)
}
