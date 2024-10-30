package _training;

public class Robots {
    static void driveRobot(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void turnRobot(String direction, int turnspeed){
        System.out.println("Robot is shooting to the "+direction);
    }
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        int robotTurnSpeed = 1; // Set the robot turn speed
        driveRobot("forward", robotSpeed); // Drive the robot forward
        driveRobot("backward", robotSpeed); // Drive the robot backwards
        shootRobot("left"); // Shoot the robot to the left
        shootRobot("right"); // Shoot the robot to the right
        turnRobot("left", robotTurnSpeed); // Turn the robot left
        turnRobot("right", robotTurnSpeed); // Turn the robot right
        int robot1Speed = 43; // Set the second robot speed
        int robot1TurnSpeed = 1; // Set the second robot turn speed
        driveRobot1("forward", robot1Speed); // Drive the second robot forward
        driveRobot1("backward", robot1Speed); // Drive the second robot backwards
        shootRobot1("left"); // Shoot the second robot to the left
        shootRobot1("right"); // Shoot the second robot to the right
        turnRobot1("left", robot1TurnSpeed); // Turn the second robot left
        turnRobot1("right", robot1TurnSpeed); // Turn the second robot right
    }
    static void driveRobot1(String direction, int speed){
        System.out.println("Second Robot is driving "+direction);
    }
    static void shootRobot1(String direction){
        System.out.println("Second Robot is shooting to the "+direction);
    }
    static void turnRobot1(String direction, int turnspeed){
        System.out.println("Second Robot is shooting to the "+direction);
    }
}