package day30_final_Static_Abstarct_Interfaces.abstractex;

public class Parent1 extends Child1 {

    public static void main(String[] args) {
        Parent1 obj=new Parent1();
        obj.learnJava();
    }

    @Override
    void learnJava() {
        System.out.println("We are done with learning core java successfullly");
    }
}
