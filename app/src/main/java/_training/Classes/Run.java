package _training.Classes;

public class Run {
    public static void main(String[] args) {
    Drink DrPerper = new Drink(true, false, 7, "Drpeper");
    Drink DietMountenDew = new Drink(true, true, 4, "Diet Mounten Dew");
    Drink ArizonaIceTea = new Drink(false, false, 6, " ArizonaIceTea");
    if(DrPerper.getscore() > DietMountenDew.getscore()){
        System.out.println("DrPerper is beter than DietMountendDew");
    }else{
        System.out.println("DietMountendDew is beter than DrPerper");
    }
    ArizonaIceTea.isfizzy();
    }
}