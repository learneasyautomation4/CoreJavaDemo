package day5_Inheritance_Interface_Abstraction_Loops.abstraction.interface_pkg;

public class Avanthi implements HumanBeing{

    public static void main(String[] args) {
        Avanthi objAvanthi=new Avanthi();
        objAvanthi.learningSkills();
        objAvanthi.controlingEmotion();
        objAvanthi.expressThoughts();
    }

    @Override
    public void learningSkills() {
        System.out.println("Avanthis is super fast learner");
    }

    @Override
    public void controlingEmotion() {
        System.out.println("Avanthi Can control superbly");
    }

    @Override
    public void expressThoughts() {
        System.out.println("Avanthis is so expression all the time");
    }
}
