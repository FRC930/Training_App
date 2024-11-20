package _training;

public class Robots {
    static void driveRobot(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        driveRobot("forward", robotSpeed); // Drive the robot forward
        driveRobot("backward", robotSpeed); // Drive the robot backwards
        shootRobot("left"); // Shoot the robot to the left
        shootRobot("right"); // Shoot the robot to the right
    }
}
