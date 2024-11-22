package _training.Classes;

public class Drink {
    //paramters 
    private String color;
    private int taste;
    private float score; 

    public Drink(String color, int taste, float score){
        this.color = color;
        this.taste = taste;
        this.score = score;
        System.out.println("luke said the bitterness was a "+taste);
    }
    //method
    public int gettaste(){
        return taste;
    }
    public void score(float score){
        this.score = score;
    }
    public void taste(int newtaste){
        this.taste = newtaste;
    };

}
