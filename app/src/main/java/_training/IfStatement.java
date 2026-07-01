package _training;
//Checked by Chase Reinders
public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = false;
        boolean tookMints = false;
        boolean did_I_take_a_shower = true;
        boolean didHomework = true;
        boolean preparedForRobotics = true;

        if((brushedTeeth || tookMints) &&did_I_take_a_shower && didHomework && preparedForRobotics){
            System.out.println("I can go to robotics tonight!");
            } else {
        System.out.println("I can't go to robotics yet.");
        if(!(brushedTeeth || tookMints) )
        System.out.println("you need to go back into the bathroom ant tack some care of your mental hygene becaus you dont give a car in the world about your teath let alone your room so the leas you can do is to use some mints to get your stinky mouth clean");
        }
    }
}
