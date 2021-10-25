package day30_final_Static_Abstarct_Interfaces;

public class Elephant implements InterfaceExample{
    public static void main(String[] args) {
        Elephant objElephant=new Elephant();
        objElephant.runningSpeed();
        objElephant.eatingHabit();

    }
    public void eatingHabit(){
        System.out.println("Elephant eats a lot");
    }

    @Override
    public void runningSpeed() {
        System.out.println("Running speed of elephant is not so fast");
    }

    @Override
    public void colorOfAnimal() {
        System.out.println("Color of Elephant is grey");
    }
}
