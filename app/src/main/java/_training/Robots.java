package _training;

public class Robots {
    static void driveRobot(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void turnRobot(String direction, double tunrSpeed){
        System.out.println("Robot is turning right"+tunrSpeed+"degrees a second");
    }
    static void shootRobot(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void driveRobot2(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot2(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        double turnSpeed = 30; // Set the speed in degrees for how fast it turns
        driveRobot("forward", robotSpeed); // Drive the robot forward
        shootRobot("left"); // Shoot the robot to the left
        turnRobot("right", turnSpeed); // Turn the robot to the right and 30 degrees a second

        driveRobot2("backward", robotSpeed);
        shootRobot2("right");
    }
    
}
