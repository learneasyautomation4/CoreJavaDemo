package day30_final_Static_Abstarct_Interfaces;

public class ClassImplementsInterface extends Lion implements  Child1 {

    public static void main(String[] args) {
        ClassImplementsInterface obj=new ClassImplementsInterface();
        obj.mimicry();
        obj.dance();
        obj.singing();
        obj.colorOfAnimal();
    }

    @Override
    public void mimicry() {
        System.out.println("Inside mimicry method");
    }

    @Override
    public void colorOfAnimal() {
        System.out.println("inside color of Animal");
    }

    @Override
    public void dance() {
        System.out.println("inside dance method");
    }

    @Override
    public void singing() {
        System.out.println("inside singing method");
    }
}
