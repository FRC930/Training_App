package _training;

public class Robots {
    int latestspeed = 1234567890;
    int latestspeed2 = 987654321;
    int latestspeed3 = 396973416;
    static void driveRobot(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void driveRobot2(String direction, int speed){
        System.out.println("Robot2 is driving "+direction);
    }
    static void shootRobot2(String direction){
        System.out.println("Robot2 is shooting to the "+direction);
    }
    static void turnRobot(String direction, int speed){
        System.out.println("Robot is turning "+direction);
    }
    static void turnRobot2(String direction, int speed){
        System.out.println("Robot2 is tunring "+direction);
    }
    static void driveRobot3(String direction, int speed){
        System.out.println("Robot3 is driving "+direction);
    }
    static void shootRobot3(String direction){
        System.out.println("Robot3 is shooting to the "+direction);
    }
    static void turnRobot3(String direction, int speed){
        System.out.println("Robot3 is turning "+direction);
    }
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        driveRobot("forward", robotSpeed); // Drive the robot forward
        shootRobot("left"); // Shoot the robot to the left
        driveRobot("backwards", robotSpeed); // Drive the robot backwards
        driveRobot("down", robotSpeed);
        driveRobot("in the Backrooms", robotSpeed); // Drive the robot in the Backrooms
        driveRobot2("right" , robotSpeed);
        driveRobot2("up" , robotSpeed);
        driveRobot2("in the Uprooms" , robotSpeed);
        driveRobot2("through an open door" , robotSpeed);
        driveRobot2("through the sky" , robotSpeed);
    }
}
