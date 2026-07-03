package _training.Classes;

public class Computer {
    protected int computationsrun = 0;

    protected int manufacturedYear;

    protected int numberMade;

    protected int numberSold;

    String prevAction;
    
        public Computer x;
        public Computer(){
            this.prevAction="None";
        }
    
        public int add(int x, int y) {
            prevAction = "add";
            computationsrun += 1;
            return x + y;
        }
    
        public int subtract(int x, int y) {
            prevAction = "sub";
            computationsrun += 1;
            return x - y;
        }

        public int multiply(int x, int y) {
            int product = 0;
            for(int i = 0; i > x; i++){
                
            }

        }
        public double divide (int x, int y) { return x / y; }
    
           
    }


