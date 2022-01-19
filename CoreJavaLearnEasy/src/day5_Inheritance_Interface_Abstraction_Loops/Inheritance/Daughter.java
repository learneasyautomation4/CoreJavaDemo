package day5_Inheritance_Interface_Abstraction_Loops.Inheritance;

//child class

//muliti level inheritance is possible and not multiple inheritance
public class Daughter extends Mother{
    public static void main(String[] args) {
        Daughter objDaughter=new Daughter();
        objDaughter.skating();

        Mother objMother=new Mother();
        objMother.appreance();

        Grandmother objGrandmother = new Grandmother();
        objGrandmother.dressingSkils();

        GreatGrandMother objGreatGrandMother=new GreatGrandMother();
        objGreatGrandMother.patience();
    }

    //child class method - non static
    private void skating() {
        System.out.println("Interested in Skating");
    }
}
