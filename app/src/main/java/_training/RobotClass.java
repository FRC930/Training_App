package _training;

public class RobotClass {
    int speed;
    int turnSpeed;
    int liftSpeed;
    String driveRobot;
    String direction;

    
    public RobotClass(int speed, int turnSpeed, int liftSpeed, String driveRobot) {
        this.speed = speed;
        this.turnSpeed = turnSpeed;
        this.liftSpeed = liftSpeed;
        this.driveRobot = driveRobot;
    }

    public RobotClass() {
        this.speed = 30;
        this.turnSpeed = 7;
        this.liftSpeed = 5;
        this.driveRobot = ("forward");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setTurnSpeed(int turnSpeed) {
        this.turnSpeed = turnSpeed;
    }

    public void setliftSpeed(int liftSpeed) {
        this.liftSpeed = liftSpeed;
    }

    public void driveRobot(String driveRobot) {
        this.driveRobot = driveRobot;
    }
} 




