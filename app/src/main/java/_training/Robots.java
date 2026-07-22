package _training;

public class Robots {
    static void driveRobot1(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void turnRobot1(String direction, int speed){
        System.out.println("Robot is turning "+direction);
    }
    static void shootRobot1(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void flipRobot1(String direction){
        System.out.println("Robot is fliping "+direction);
    }
//______________________________________________________________________________

    static void driveRobot2(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void turnRobot2(String direction, int speed){
        System.out.println("Robot is turning "+direction);
    }
    static void shootRobot2(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void flippingRobot2(String direction){
        System.out.println("Robot is flipping "+direction);
    }
    //______________________________________________________________________________

    static void driveRobot3(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void turnRobot3(String direction, int speed){
        System.out.println("Robot is turning "+direction);
    }
    static void shootRobot3(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void flippingRobot3(String direction){
        System.out.println("Robot is flipping "+direction);
    }
    public static void main(String[] args){
        int robotSpeed1 = 20; // Set the robot speed
        driveRobot1("forward", robotSpeed1); // Drive the robot forward
        shootRobot1("left"); // Shoot the robot to the 
        turnRobot1("right", robotSpeed1); // turn the robot to the left
        int robotSpeed2 = 15; // Set the robot speed
        driveRobot2("forward", robotSpeed2); // Drive the robot forward
        shootRobot2("left"); // Shoot the robot to the 
        turnRobot2("right", robotSpeed2); // turn the robot to the left
        int robotSpeed3 = 10; // Set the robot speed
        driveRobot3("forward", robotSpeed3); // Drive the robot forward
        shootRobot3("left"); // Shoot the robot to the 
        turnRobot3("right", robotSpeed3); // turn the robot to the left
    }
}



