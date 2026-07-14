package _training;

public class Robots {
    static void driveRobot1(String direction, int speed){
        System.out.println("Robot1 is driving "+direction);
    }
    static void shootRobot1(String direction){
        System.out.println("Robot1 is shooting to the "+direction);
    }
        static void driveRobot2(String direction, int speed){
        System.out.println("Robot2 is driving "+direction);
    }
    static void shootRobot2(String direction){
        System.out.println("Robot2 is shooting to the "+direction);
    }
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        driveRobot1("forward", robotSpeed); // Drive the robot forward
        shootRobot1("left"); // Shoot the robot to the left
        driveRobot1("left", 10);
        driveRobot1("backward", 30);
        shootRobot1("forward");
        driveRobot2("backward", robotSpeed);
        shootRobot2("right");
        driveRobot2("right",robotSpeed);
        shootRobot2("forward");

    }
}
