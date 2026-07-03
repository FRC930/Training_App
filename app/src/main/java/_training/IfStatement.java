package _training;

import java.io.NotActiveException;

public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = false;
        boolean tookMints = true;
        boolean didHomework = false;
        boolean preparedForRobotics = true;

        if((brushedTeeth || tookMints) && didHomework && preparedForRobotics){
            System.out.println("I can go to robotics tonight!");
        } else {
            System.out.println("I can't go to robotics yet.");
            if(!didHomework) {
                System.out.println("i need to do my homework!");
            } 
            if(!(brushedTeeth || tookMints)) {
                System.out.println("I need to freshen up my breath!");
            }
        }
    }
}
