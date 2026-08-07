package _training;

public class While {
    public static void main(String[] args) {
        int hoursWorked = 0;

        while (hoursWorked < Integer.MAX_VALUE) {
            System.out.println("I have worked for "+hoursWorked+" hours!");
            hoursWorked = hoursWorked + 1;
            if (hoursWorked<1){
                break;
            }
        }

        System.out.println("I am done working! I have worked for "+hoursWorked+" hours!");
    }
}
