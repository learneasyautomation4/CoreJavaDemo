package day5_Inheritance_Interface_Abstraction_Loops.abstraction.abstract_class;

public class ModernArt extends  Art{

    public static void main(String[] args) {
        ModernArt objModernArt=new ModernArt();
        objModernArt.painting();
        objModernArt.drawing();
    }

    @Override
    void painting() {
        System.out.println("Painting is my hobby");
    }
}
