package _training.Classes;

public class Drink {
    private float bitterness;
    private boolean fizzy;
    private String name;

    public Drink(float bitterness, boolean fizzy, String name){
        this.bitterness = bitterness;
        this.fizzy = fizzy;
        this.name = name;
        System.out.println(name+ " is served");
    }
    // Methods
    public String getname(){
        return this.name;
    }
    public void name(String name){
        this.name = name;
    }
}
