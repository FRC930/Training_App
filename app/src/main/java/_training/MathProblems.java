package _training;

public class MathProblems {
        static void additionint(int num, int num2){
                System.out.println(num+num2);
            
        }
        static void additionfloat(float num, float num2){
                System.out.println(num+num2);
            
        }
        static void additiondouble(double num, double num2){
                System.out.println(num+num2);
            
        }
        static void additionmyproblem(double num, double num2){
                System.out.println(num+num2);
            
        }
        static void subtractionint(int num, int num2){
                System.out.println(num-num2);
            
        }
        static void subtractionfloat(float num, float num2){
                System.out.println(num-num2);
            
        }
        static void subtractiondouble(double num, double num2){
                System.out.println(num-num2);
            
        }
        static void subtractionmyproblem(double num, double num2){
                System.out.println(num-num2);
            
        }
        static void multiplicationint(int num, int num2){
                System.out.println(num*num2);
            
        }
        static void multiplicationfloat(float num, float num2){
                System.out.println(num*num2);
            
        }
        static void multiplicationdouble(double num, double num2){
                System.out.println(num*num2);
            
        }
        
        public static void main(String[] args){
        
        //section 1 addition

        System.out.println("\n");
        System.out.println("Addition");
        System.out.println("\n");

        additionint(1, 2);
        additionfloat(2.6f, 5.7f);
        additiondouble(3.14159265389, 1.53634);
        additionmyproblem(7.674256, 9.36254);
        
        
        System.out.println("\n");
        System.out.println("Subtraction");
        System.out.println("\n");


        //section 2 subtraction

        subtractionint(3, 1);
        subtractionfloat(4.5f, 7.6f);
        subtractiondouble(3.14159265389, 8.372856);
        subtractionmyproblem(23.546346, 4.265567);


        //section 3 multiplication
        System.out.println("\n");
        System.out.println("Multiplication");
        System.out.println("\n");

        multiplicationint(7, 9);
        multiplicationfloat(4.4f, 7.6f);
        multiplicationdouble(6.24525765, 8.13426535);


        double me = -2134;
        double meme = 654;

        double mememe = me * meme;
        System.out.println(mememe + " double");

        double ah = Math.PI;

        double ahah = ah * ah;
        System.out.println(ahah + " my problem");

        //section 4 division
        System.out.println("\n");
        System.out.println("Division");
        System.out.println("\n");

        int dime = -9;
        int dimedimedime = 9;

        int dimedime = dimedimedime / dime;
        System.out.println(dimedime + " int");

        float quarter = 5.2f;
        float quarterquarter = -89.7f;

        float quarterquarterquarter = quarter / quarterquarter;
        System.out.println(quarterquarterquarter + " float");

        double nickle = 3.14159634785672356;
        double nicklenickle = -957939279;

        double nicklenicklenickle = nickle / nicklenickle;
        System.out.println(nicklenicklenickle + " double");

        int last = 1;
        int lastproblem = 89;

        int finalvariable = last + lastproblem * last;
        System.out.println(finalvariable + " my last problem");

        //done
        
    }
}
