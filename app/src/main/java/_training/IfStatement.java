package _training;

public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = true;
        boolean preparedForRobotics = true;
        secondary(brushedTeeth, tookMints, didHomework, preparedForRobotics);
    }

    static void secondary(boolean brushedTeeth, boolean tookMints, boolean didHomework, boolean preparedForRobotics) {
        if ((brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
            System.out.println("I can go to robotics tonight!");
        } else if (!(brushedTeeth || tookMints)) {
            System.out.println("Gotta freshen up!");
        } else if (!didHomework) {
            System.out.println("Oh darn, I gotta do my Math homework!");
        } else if (!preparedForRobotics) {
            System.out.println("Oop, I need to finish finding my sponsors!");
        }
    }
}
