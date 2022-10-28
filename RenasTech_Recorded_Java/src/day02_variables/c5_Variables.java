package day02_variables;

public class c5_Variables {

   //whole numbers: byte,short,int,long
   // decimal numbers: float,double

    public static void main(String[]args){
        // -128 BYTE 127
              //byte number1=135;   this swill give you error because it is out of the byte range
         byte number2=23;
         byte number3=-19;
         System.out.println(35);
         System.out.println(number2);
         System.out.println(23);
         System.out.println(number3);
         System.out.println(-19);

        //-32,768 SHORT 32767

        short short1=128;
        System.out.println(short1);
        short short2=20000;
        System.out.println(short2);

        //-2,147,483,648 INT 2,147,483,647
        int int1=1235654;
        System.out.println(int1);

        System.out.println("33"); // This is text
        System.out.println(33);   // This is actual number
        long long1=2000000000000L;//Putting L end of the number to indicate this is long not an integer,bc int default in java
        System.out.println(long1);


    }
}
