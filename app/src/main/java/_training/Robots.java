package _training;

public class Robots {
    static void driveRobot(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void turnrobot(String direction){
        System.out.println("robot is turning "+direction);
    }
    static void driveRobot1(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot1(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void turnrobot1(String direction){
        System.out.println("robot is turning "+direction);
    }
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        driveRobot("forward", robotSpeed); // Drive the robot forward
        shootRobot("left"); // Shoot the robot to the left
        turnrobot("right");
        driveRobot1("back", robotSpeed); // Drive the robot forward
        shootRobot1("right"); // Shoot the robot to the left
        turnrobot1("left");
    }
    }

