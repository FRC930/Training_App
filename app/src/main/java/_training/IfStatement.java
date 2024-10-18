package _training;

public class IfStatement {
    public static void main(String[] args) {

        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = true;
        boolean preparedForRobotics = true;

        if ((brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
            System.out.println("I can go to robotics tonight!");
        } else if (!(brushedTeeth || tookMints)) {
            System.out.println("Gotta freshen up!");
        } else if (!didHomework) {
            System.out.println("Oh darn, I gotta do my Math homework!");
        } else if (!preparedForRobotics) {
            System.out.println("Oop, I need to finish finding my sponsors!");
        }

        // if ( (brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
        //     System.out.println("I can go to robotics tonight!");
        // } else {
        //     System.out.println("I can't go to robotics yet.");

        // if (preparedForRobotics) {
        //     System.out.println("i forgot to do homework");
        // } else {
        //     System.out.println("im not going");
        // } 
        

        // if((brushedTeeth || tookMints) && didHomework && preparedForRobotics){
        //     System.out.println("I can go to robotics tonight!");
        // }
    }
}
