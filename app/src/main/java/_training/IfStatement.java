package _training;

public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = false;
        boolean preparedForRobotics = true;

        if((brushedTeeth || tookMints) && didHomework && preparedForRobotics){
            System.out.println("I can go to the pizza place with my friends!");
            if ( (brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
    System.out.println("I can go to the pizza place with my friends!");
} else {
    System.out.println("I can't go to the pizza place with my friends.");
}
        }
    }
}
