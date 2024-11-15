package _training;

public class Robots {
    static void driveRobot1(String direction1, int speed1){
        System.out.println("Robot1 is driving "+direction1);
    }
    static void turningRobot1(String direction1, int turningSpeed1){
        System.out.println("Robot1 is turning "+direction1);
    }
    static void shootRobot1(String direction1){
        System.out.println("Robot1 is shooting to the "+direction1);
    }
    static void turnRobot1(String direction1){
        System.out.println("Robot1 is turning "+direction1);
    }
    static void intakingRobot1(String direction1){
        System.out.println("Robot1 is intaking "+direction1);
    }


    //robot2 functions

    static void driveRobot2(String direction2, int speed2){
        System.out.println("Robot2 is driving "+direction2);
    }
    static void turningRobot2(String direction2, int turningSpeed2){
        System.out.println("Robot2 is turning "+direction2);
    }
    static void shootRobot2(String direction2){
        System.out.println("Robot2 is shooting to the "+direction2);
    }
    static void turnRobot2(String direction2){
        System.out.println("Robot2 is turning "+direction2);
    }
    static void intakingRobot2(String direction2){
        System.out.println("Robot2 is intaking "+direction2);
    }
    public static void main(String[] args){
        int robot1TurnSpeed = 15;
        int robot1Speed = 20; // Set the robot speed
        turningRobot1("right", robot1TurnSpeed);
        driveRobot1("forward", robot1Speed); // Drive the robot forward
        shootRobot1("left");
        turnRobot1("right"); // Shoot the robot to the left
        intakingRobot1("forward");

        System.out.println("----------------------------------");

        //robot2 actions

        int robot2TurnSpeed = 10;
        int robot2Speed = 30; // Set the robot speed
        turningRobot2("left", robot2TurnSpeed);
        driveRobot2("forward", robot2Speed); // Drive the robot forward
        shootRobot2("left");
        turnRobot2("right"); // Shoot the robot to the left
        intakingRobot2("forward");
    }
    
}

