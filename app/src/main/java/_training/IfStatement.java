package _training;

import javax.lang.model.util.ElementScanner14;

public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = false;
        boolean preparedForRobotics = true;
        boolean study = !false;
        boolean doNotHaveVolleyball = true;
        boolean doNotHavePractice = true;

        if ((brushedTeeth || tookMints) && didHomework && preparedForRobotics) {
            System.out.println("I can go to robotics tonight!");
        } else
            System.out.println("I can't go to robotics yet!");

        if ((didHomework || study) && doNotHaveVolleyball && doNotHavePractice) {
            System.out.println("I can play videogames!");
        } else
            System.out.println("I can't play videogames ever!");
    }
}
