package JavaConcepts.collections.list;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        //creating vector - like a dynamic array
        Vector<String> objVector=new Vector<String>();

        //adding an element
        objVector.add("Sangeetha");
        objVector.add("Kavitha");

        objVector.addElement("Nila");


        System.out.println("size of the vecor: " + objVector.size());


        //removing an item
        objVector.remove(1);

        System.out.println("size of the vecor: " + objVector.size());


        //replacing teh vector item
        objVector.set(0,"Menaka");



        objVector.subList(0,1);

        //retrieves the value based on the index
        String name=objVector.get(1);

        System.out.println(name);
    }



}
