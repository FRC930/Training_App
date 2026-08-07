package _training.Classes;


public class ComputerMain {
    public static void main(String[] args) {
        Computer myCOMPOOTER = new Computer ();
        Computer myCOMPOOTEROther = new Computer ();
        int sum = myCOMPOOTER.add(1, 17000);
        int dif = myCOMPOOTEROther.subtract(17, 8);
        myCOMPOOTER.prevAction = "cool things";
        System.out.println(sum);
        System.out.println(myCOMPOOTER.prevAction);
        System.out.println(myCOMPOOTEROther.computationsrun);
    }
}
