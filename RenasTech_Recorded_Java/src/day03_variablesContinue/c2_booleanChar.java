package day03_variablesContinue;

public class c2_booleanChar {
    public static void main(String[] args) {
        //dataTypes variableName=data;

        //boolean  1 bit  stores true or false  //Checks to CONDITION mostly

        boolean b1=true;
        boolean b2=false;

        boolean b3=10>15; //false
        System.out.println(b3);
        System.out.println(b2);
        System.out.println(b1);



        // == means equal
        // !=means not equal


        //More practice
        boolean bool1= 25==30;
        boolean bool2= 20!=21;
        System.out.println(bool1);
        System.out.println(bool2);

        //! makes the condition reverse , opposite
        System.out.println(true==false);  //false
        System.out.println(!true==false);  //! makes it true ,!true means false, false==false become true


        System.out.println(!true != !false);
                //!true means false ,!false means true,
                    // became F not equal T , so its T

        System.out.println(!(true == false));
                               //T==F is F, and !(false) is T
        System.out.println( !(true==true) == (false == !true));
                                //!(true) == (true) is false




        //char 2 bytes  stores a single character/letter or ASCII values 'a'

        //    char ch2='aDJBLKJ'; char for only single letter or number from ASCII table
        char ch1='a';
        char c2='2';
        char c3='@';

//char c4='aa'; error , char can only store single character/letter or  ASCII values
        System.out.println(ch1);
        System.out.println(c2);
        System.out.println(c3);


        //ascii table
        //from ascii table number 97 is equal small letter a
        //SEE DIFFERENCE BELOW!
        char c1=97;
        int i=97;
        System.out.println(c1);
        System.out.println(i);

int i1=65;
char chr2=65;
char chr3='A';
        System.out.println(i1);
        System.out.println(chr2);
        System.out.println(chr3);
        System.out.println(i1+chr2); //int + char=? 65 + 65
        //since we have int as a number and wanted to sum with char
        //java will take ascii number for char
    }
}
