package _training;

//Checked by Chase Reinders
public class While {
    public static void main(String[] args) {
        int hoursWorked = 0;

        while (hoursWorked < 5) {
            System.out.println("I have worked for "+hoursWorked+" hours!");
            hoursWorked = hoursWorked - 1;
            if (hoursWorked < 1){
                break;
            }
        }
        
        System.out.println("I am done working! I have worked for "+hoursWorked+" hours!");
    }
}
