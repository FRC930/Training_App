package _training;

public class Return {
    static float square(float num){
        return num*num;
    }
    public static void main(String[] args){
        float square5 = square(5);
        float square2 = square(2);
        System.out.println(square5 + square2);

        float square10 = square(10);
        float square6 = square(6);
        System.out.println(square10 * square6);

        
    }
}
