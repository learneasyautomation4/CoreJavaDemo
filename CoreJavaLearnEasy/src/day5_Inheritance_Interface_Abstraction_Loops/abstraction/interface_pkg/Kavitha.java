package day5_Inheritance_Interface_Abstraction_Loops.abstraction.interface_pkg;

public class Kavitha implements HumanBeing{

    public static void main(String[] args) {
        Kavitha objKavitha=new Kavitha();
        objKavitha.learningSkills();
        objKavitha.controlingEmotion();
        objKavitha.expressThoughts();
    }

    @Override
    public void learningSkills() {
        System.out.println("Kavitha is a great learner");
    }

    @Override
    public void controlingEmotion() {
        System.out.println("Kavitha's emotional is too high");
    }

    @Override
    public void expressThoughts() {
        System.out.println("Kavitha is not much expressive");
    }
}
