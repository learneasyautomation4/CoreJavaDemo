package day04_ifStatements;

public class c2_primitiveCasting {

    //we have 2 type of primitive casting
    //1.implicit casting (done automatically from java)
    //2.explicit casting (needs to be handle manually)

    //double > float > long > int > short > byte

    public static void main(String[] args){

        byte b1=20; // -128 to 127
        long l1=b1; // this is impilicit casting (done will autamticly by java)


        int i1=10;
        byte b2= (byte) i1;//explicit casting . This will done by you manually.

        double d1=2.3;
        float f1= (float) d1;//explicit casting


        int i2=200;
        long l2=i2; //implicit casting


        short s=155;

       // long > int > short > byte
        //8 > 4 > 2 >1

        short sh=23432;
        int i6=234324324;

        int i= sh; //implicit type casting
        int num1=48596;
        short sh1=(short)num1; //explicity types

        long l11=2343432;
//        long l12=l11;

        byte b11=10;
//        byte b12=b11;

        byte b12=(byte)l11;

        long l12=b11;

        //float >>Double
        // 2 bytes >> 8 bytes

        float f_1=23.36f;
        double d_1=f_1;

        double d_2=8596.485965;
        float f_2=(float)d_2;

    }

}
