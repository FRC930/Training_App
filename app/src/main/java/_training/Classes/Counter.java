package _training.Classes;

public class Counter {
    private int current = 0;

    public int currentValue() {
        return this.current;
    }

    public void printValue() {
        System.out.println(this.currentValue());
    }

    public int incrementValue() {
        // The unary prefix ++ operator increases a variable, then returns the new value.
        return ++this.current;
    }

    public static void main(String[] args) {
        Counter score = new Counter();

        score.incrementValue();

        score.printValue();
    }
}