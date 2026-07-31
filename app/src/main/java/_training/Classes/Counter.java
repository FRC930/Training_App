package _training.Classes;

public class Counter {
    private int current = 0;

    int currentValue() {
        return this.current;
    }

    int incrementValue() {
        // The unary prefix ++ operator increases a variable, then returns the new value.
        return ++this.current;
    }

    int decrementValue() {
        return --this.current;
    }

    int dubbleValue() {
        this.current= this.current *2;
        return this.current;
    }
}