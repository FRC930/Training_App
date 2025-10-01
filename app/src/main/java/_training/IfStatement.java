package _training;

public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = true;
        boolean preparedForRobotics = false;
        boolean havescouts = true;

        if((brushedTeeth || tookMints) && (!havescouts) && didHomework && preparedForRobotics){
            System.out.println("I can go to robotics tonight!");
        }else if (!(brushedTeeth || tookMints)) {
            System.out.println("Gotta freshen up!");
        } else if (!didHomework) {
            System.out.println("Oh darn, I gotta do my Math homework!");
        } else if (!preparedForRobotics) {
            System.out.println("Oop, I need to finish finding my sponsors!");
        } else if (havescouts){
            System.out.println("I got to get my rank up!");
        }
    }
}
