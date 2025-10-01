package _training.Classes;

public class Drink {
    private boolean fizy;
    private boolean diet;
    private float score;
    private String name;

    public Drink(boolean fizy, boolean diet, float score, String name){
        this.fizy = fizy;
        this.diet = diet;
        this.score = score;
        this.name = name;

        public String getName(){
         return this.name;
        }
    }
} 
