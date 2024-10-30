package _training.Classes;

public class Drink {
    private float bitterness;
    private boolean fizzy;
    public String name;

    public Drink(float bitterness, boolean fizzy, String name){
        this.bitterness = bitterness;
        this.fizzy = fizzy;
        this.name = name;
        System.out.println(name+ "is served");
    }
    public String getname(){
        return this.name;
    }
}
