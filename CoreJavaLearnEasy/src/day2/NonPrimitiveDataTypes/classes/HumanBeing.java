package day2.NonPrimitiveDataTypes.classes;

public class HumanBeing {
    //variables
    String color = "Black";
    float height = 158.8f;
    int weight = 50;

    public static void main(String[] args) {
        //object - states and behaviours


        //object creation for the class
        HumanBeing obj = new HumanBeing();
        obj.printHeight();
        obj.printColor();
        obj.setWeight();
    }

    private void setWeight() {
        weight = 70;
        System.out.println("Weight is: " + weight);
    }

    private void printColor() {
        System.out.println("Color is:" + color);
    }

    private void printHeight() {
        color = "white";
        System.out.println("height is:" + color);
    }


}
