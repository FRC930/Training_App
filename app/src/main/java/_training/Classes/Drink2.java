package _training.Classes;

public class Drink2 {
    public static void main(String[] args){
        Drink dipsi = new Drink(4, true, "dipsi");
        dipsi.name("dipsi");
        dipsi.getname();
        System.out.println(dipsi.getname());
        dipsi.name("no");
        System.out.println(dipsi.getname());
        Drink DountianMu = new Drink(1, false, "DountainMu");
        DountianMu.name("DountainMu");
        DountianMu.getname();
        System.out.println(DountianMu.getname());
    }
}