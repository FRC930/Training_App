package _training;

public class Robots {
    static void driveRobot(String direction, int speed){
        System.out.println("Robot is driving "+direction);
    }
    static void shootRobot(String direction){
        System.out.println("Robot is shooting to the "+direction);
    }
    static void turnrobot(String direction){
        System.out.println("robot is turning" + direction);
    }
    static void intakerobot(String direction){
        System.out.println("robot is intaking" + direction);
    }
    public static void main(String[] args){
        int robotSpeed = 20; // Set the robot speed
        driveRobot("forward", robotSpeed); // Drive the robot forward
        shootRobot("left"); // Shoot the robot to the left
    }
    static void drivemore(String[] args){ 
        turnrobot("right"); // turn the robot right
        intakerobot("intake"); // the robot uses the intake
    }
    class Robots1 {
        static void driveRobot1(String direction, int speed){
            System.out.println("Robot is driving " + direction);
        }
        static void shootRobot1(String direction){
            System.out.println("Robot is shooting to the " + direction);
        }
        static void turnrobot1(String direction){
            System.out.println("robot is turning" + direction);
        }
        static void intakerobot1(String direction){
            System.out.println("robot is intaking" + direction);
        }
        public static void main(String[] args){
            int robotSpeed = 18; // Set the robot speed
            driveRobot1("forward", robotSpeed); // Drive the robot forward
            shootRobot1("left"); // Shoot the robot to the left
        }
        static void drivemore(String[] args){ 
            turnrobot1("right"); // turn the robot right
            intakerobot1("intake"); // the robot uses the intake
        }
        
    }
}
