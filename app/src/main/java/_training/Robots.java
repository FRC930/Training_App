package _training;

public class Robots {
    static void driveRobot(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void moveshoot(String direction, int speed){
        System.out.println("the robot is moving at "+speed+" MPH and while facing "+direction);
    }
    static void jumprobot(String direction, int speed){
        System.out.println("the robot went "+direction+" at "+speed+" MPH ");
    }
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        moveshoot("right", robotSpeed);
        driveRobot("forward", robotSpeed); // Drive the robot forward
        shootRobot("left"); // Shoot the robot to the left
        int robotSpeed1 = 45; // Set the robot speed
        moveshoot("right", robotSpeed1);
        driveRobot("forward", robotSpeed1); // Drive the robot forward
        shootRobot("left"); // Shoot the robot to the left
        jumprobot("up", robotSpeed1);
    }
}
    