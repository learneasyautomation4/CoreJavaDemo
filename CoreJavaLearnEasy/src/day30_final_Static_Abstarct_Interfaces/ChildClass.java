package day30_final_Static_Abstarct_Interfaces;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {
        ParentClass objParentClass = new ParentClass();
        ParentClass.displayAge(); //classreference - call the static method of another class - made as public
        objParentClass.displayNonStaticMethod(); //objectReferecne - call the non static method of another class - made as public
        objParentClass.method_final();
        ChildClass objChildClass=new ChildClass();
        objChildClass.method_Instatnce();
    }

//overrriding method can not be done - final method
//    public final void method_final(){
//        System.out.println("Final variable inside the final method: " + age_final);
//    }



    //overriding method
    public  void method_Instatnce(){
        System.out.println("Instatnce variable inside the non final method:- child class " + age_final);
    }
}