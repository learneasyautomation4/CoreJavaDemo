package JavaConcepts.collections.list;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> objStack=new Stack<Integer>();
        Boolean bool=objStack.empty();
        System.out.println("Is stack empty?" +bool);
        objStack.push(1);
        objStack.push(20);
        objStack.push(15);
        objStack.push(12);
        System.out.println("Stack of elements" +objStack);
        Boolean bool1=objStack.empty();
        System.out.println("Is stack empty?" +bool1);

        objStack.pop();
        System.out.println("Stack of elements" +objStack);




    }
}
