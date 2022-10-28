package day02_variables;

public class c4_escapeSequences {
    /*               Escape Sequences :

                \t : paragraph space
                \n : new line
                \" : prints double quote on the console
                \\ : prints \ on the console
                \' : prints single quote
                 ' : prints single quote
                                            */
    public static void main(String[]args){
        System.out.println("RenasTech");

             //   \t : paragraph space
        System.out.println("\tRenasTech");  // u can see the extra space before your text
        System.out.println("    RenasTech"); // \t equals to 4 spaces

            //     \n: new line
        System.out.println("Hello \nWorld!");
        System.out.println("Hello \n\tWorld!");
        System.out.println("\tHello\n\tWorld!");

           //     \" : prints double quote on the console
           //     \\ : prints \ on the console
        System.out.println("\\"); //  \\ equals to \ , cause after // ignored by computer
        System.out.println("Today is \"Thursday\"! ");

          //      \' : prints single quote
          //       ' : prints single quote
        System.out.println("Today is \'Thursday\'! ");
        System.out.println("Today is 'Thursday'! ");



    }

}
