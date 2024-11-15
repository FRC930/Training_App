package _training;

public class RobotClass {
    int speed;
    int turnSpeed;
    int liftSpeed;

    public RobotClass(int speed, int turnSpeed, int liftSpeed) {
        this.speed = speed;
        this.turnSpeed = turnSpeed;
        this.liftSpeed = liftSpeed;
    }

    public RobotClass() {
        this.speed = 30;
        this.turnSpeed = 7;
        this.liftSpeed = 5;
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
} 




