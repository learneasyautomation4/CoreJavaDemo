package day30_final_Static_Abstarct_Interfaces;

//final
//variables - stop the value change
//methods - final mehtod can not be overriddent
//blocks - no final block is available
//final class - can not be inherited
//public  final class ParentClass {

public class ParentClass {

    int age = 50; //instance variable - non static
    int age3;
    static int age1 = 51; //static variable
    static int age4;

    final int age2_final = 40; //final variable
    final int age_final = 41; //initialization is required during declaration itself;

    public static void main(String[] args) {
        System.out.println("age1: " + age1);

        ParentClass obj = new ParentClass();
        System.out.println("age: " + obj.age);
        displayAge();

        obj.displayNonStaticMethod();
        //System.out.println("Final variable: " + age_final); //not allowed

    }

    //non static method - can accesss static and non static, final varaibles
    public void displayNonStaticMethod() {

//        age=55;
        age3 = 12;
        System.out.println("age1: " + age1);
        System.out.println("age: " + age);

        System.out.println("age3: " + age3);
        System.out.println("Final variable: " + age_final);

        //age2_final=11; //stop the value change or reinitailization is restricted
    }


    //static method can call only static varaibles
    public static void displayAge() {
//        age1=60;

        age4 = 42;
        System.out.println("age1: " + age1);
        System.out.println("age4: " + age4);

        ///System.out.println("Final variable: " + age_final); - not allowd
    }

    //instance block
    {
        age = 70;
    }

    //static block
    static {
        age1 = 80;
    }

//final method
    public final void method_final(){
        System.out.println("Final variable inside the final method: " + age_final);
    }


    public  void method_Instatnce(){
        System.out.println("Instatnce variable inside the method: - parent class " + age_final);
    }

}
