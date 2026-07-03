package _training;

public class Robots {
    static void driveRobot(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot(String direction, String otherDirection){
        System.out.println("Robot is shooting to the "+direction);
        System.out.println("Robot is turning to the "+otherDirection);
    }

    
    public static void main1(String[] args){
        int robotSpeed = 20; // Set the robot speed
        driveRobot("forward", robotSpeed); // Drive the robot forward
        shootRobot("left","east-west"); // Shoot the robot to the left
        
    }
 
static void driveRobot1(String direction, int speed){
        System.out.println("Robot number 2 is driving "+direction);
    }
    static void shootRobot1(String direction, String otherDirection){
        System.out.println("Robot number 2 is shooting to the "+direction);
        System.out.println("Robot number 2 is turning to the "+otherDirection);
    }

    
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        driveRobot("forward", robotSpeed); // Drive the robot forward
        shootRobot("left","east-west"); // Shoot the robot to the left 
        }
    }