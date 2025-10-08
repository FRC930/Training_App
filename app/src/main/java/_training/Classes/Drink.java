package _training.Classes;

public class Drink{
    private float calories;
    private boolean fizzy;
    private String flavor;

    public Drink(float calories, boolean fizzy, String flavor){ //constructer//
        this.calories = calories;
        this.fizzy = fizzy;
        this.flavor = flavor;
    }
    public float getcalories(){
        return this.calories;
    }
    public boolean getfizzy(){
        return this.fizzy;
    }
    public String getflavor(){
        return this.flavor;
    }
}