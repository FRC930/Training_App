package _training;

public class Return {
    static int square(int num){
        int result = num*num;
        return result;
    }
    static float square1(float num){
        float result = num/num;
        return result;}
    public static void main(String[] args){
        
        System.out.println(square(5) + square(2));

        System.out.println(square(5) + square(3));

        System.out.println(square1(5) / square1(2));
    }
}
