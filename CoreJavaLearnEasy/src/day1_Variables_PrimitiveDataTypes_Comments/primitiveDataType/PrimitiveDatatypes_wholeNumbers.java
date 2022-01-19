package day1_Variables_PrimitiveDataTypes_Comments.primitiveDataType;

/*
Primitive data types to store whole numbers
 */
public class PrimitiveDatatypes_wholeNumbers {
    public static void main(String[] args) {

        //byte -> short -> int -> long

        //1 byte => stores whole number -128 to 127
        byte number1 = 40;
        System.out.println("Byte value: " + number1);


        //short - data type
        // short = 2 bytes
        //ranges form -32,768 to 32,767
        short number2 = 525;
        System.out.println("Short data type value: " + number2);

        //integer data type
        //int => 4 bytees
        //stores whole number from -2,147,483,648 to 2,147,483,647
        int number3 = 45263;
        System.out.println("Integer data type value: " + number3);

        //long data type - > 8 bytes
        //stores teh whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long number4=5465461289872343L;
        long number5=8563;

        System.out.println("Long data type value: " +number4 + " and " + number5 );


    }
}
