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
        System.out.println(name);
       
    }
    public boolean isfizzy(){
        if(fizy){
            System.out.println(name+" is a soda");
        }else{
            System.out.println("THIS IS NOT SODA!!! IT'S TEAAA!!!!");
        }
        return this.fizy;
    }
    public boolean isdiet(){
        return this.diet;
    }
    public float getscore(){
        return this.score;
    }
    public String whatisname(){
        return this.name;
    }
} 
