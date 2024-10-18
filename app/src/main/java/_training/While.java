package _training;

public class While {
    public static void main(String[] args) {
        int hoursWorked = 5;
        

        while (hoursWorked < 8) {
            if ((hoursWorked < 1 )) {
                break;
            }
            System.out.println("I have worked for "+hoursWorked+" hours!");
            hoursWorked = hoursWorked - 1;
        }

        System.out.println("I am done working! I have worked for "+hoursWorked+" hours!");
    }
}
