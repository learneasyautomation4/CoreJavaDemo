package day02_variables;

public class c3_escapeSequences {
//    escape sequences:
//   \t: paragraph space
//	 \n: new line
//	 \": prints double quote " on the console
//	 \\: prints \ on the console
//	 \': prints single quote
//   ' : prints single quote

    public static void main(String [] args){
        System.out.println("Learn Easy Automation");

        //   \t: paragraph space
        System.out.println("\tLearn Easy Automation");
        System.out.println("    Learn Easy Automation");
        System.out.println("\t\t\t\tLearn Easy Automation");

        //	 \n: new line -- text will be displayed in new line
        System.out.println("Hello World");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \n\tWorld \tJava");


        // \\ -- this will print single slash on the consule
        System.out.println("\\");
        System.out.println("/");

        // ""    \": prints double quote " on the console
        System.out.println("Today is \"Tuesday \" . ");

        //	 \': prints single quote
        System.out.println("Today is \'Tuesday \' .");
        System.out.println("Today is 'Tuesday' . ");



    }

}