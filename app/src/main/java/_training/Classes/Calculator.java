package _training.Classes;

public class Calculator {
    private int previousAnswer;
    private String colour;

    public Calculator(Sting colour) {
        this.colour = colour;
        this.previousAnswer = 0;
        System.out.println("There is a new " + this.colour + " calculator!");
    }

    public int runCalculation(String opcode, int x, int y) {
        if(opcode.equals("add")) {
            return this.add(x, y);
        }
        if(opcode.equals("sub")) {
            return this.subtract(x, y);
        }
    }

    public void printCalculation(String opcode, int x, int y) {
        System.out.println(this.runCalculation(opcode, x, y));
    }
}