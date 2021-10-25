package day30_final_Static_Abstarct_Interfaces;

public class Lion implements InterfaceExample{

    public static void main(String[] args) {
        Lion objLoin=new Lion();
        objLoin.eatingHabit();
    }


    public void eatingHabit(){
        System.out.println("Lion eats other animals");
    }

    @Override
    public void runningSpeed() {
        System.out.println("Runnin speed is veryfast");
    }
}
