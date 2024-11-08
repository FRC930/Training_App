package _training;

public class Parameters {
    static void multiplay(float num,float non){
        System.out.println(num*non);
    }
    static void multiplay(double num,double non){
        System.out.println(num*non);
    }

    public static void main(String[] args){
        multiplay(2.3,6.1);
        multiplay(9,9);
        multiplay(100,120);
        multiplay(3.5343334, 65.3454);
    }
}
