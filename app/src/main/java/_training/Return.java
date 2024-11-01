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
        float squareFive = square(5);
        float squareTwo = square(2);
        System.out.println(square(5) + square(2));

        float squaresix = square(6);
        float squarethree = square(3);
        System.out.println(square(5) + square(3));

    }
}
