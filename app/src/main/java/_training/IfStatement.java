package _training;

public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = false;
        boolean preparedForRobotics = true;

        if((brushedTeeth || tookMints) && didHomework && preparedForRobotics){
            System.out.println("I can go to robotics tonight!");
        } else {
            if (!(brushedTeeth || tookMints)) {
                System.out.println("Gotta freshen up!");
            }
            if (!didHomework) {
                System.out.println("Oh darn, gotta do my Math homework");
            }
            if (!preparedForRobotics) {
                System.out.println("Oop, I need to finish finding my sponsors!");
            }
        }
    }
}
