package _training;

public class IfStatement {
    public static void main(String[] args) {
        boolean brushedTeeth = true;
        boolean tookMints = false;
        boolean didHomework = !false;
        boolean preparedForRobotics = true;
        boolean chargedthecomputer = !true;
        boolean daymonday = true;
        boolean wasfocastedinmath = true;

        if ((daymonday)){
            boolean schoolopen = true;
        if ((schoolopen && chargedthecomputer && didHomework)){
            System.out.println("I am going to have a good day today");
        } else {
            System.out.println("today is not of to a good start");
        if ((wasfocastedinmath)){
            boolean homeworkformath = false;
        if ((homeworkformath)){
            System.out.println("I was not focasted in class so I have no homework");
            didHomework = false;
        } else {
            System.out.println("I was focasted in class so now I don't have homework");         
        }   

        if((brushedTeeth || tookMints) && didHomework && preparedForRobotics){
            System.out.println("I can go to robotics tonight!");
        } else { 
            System.out.println("I can't go to robotics yet");
        }
       if((tookMints && chargedthecomputer) && didHomework){
            System.out.println("I am going to need to borrow a computer ");
        } else {
            System.out.println("I have a fully charged computer. Great!");
        }}}}}}
