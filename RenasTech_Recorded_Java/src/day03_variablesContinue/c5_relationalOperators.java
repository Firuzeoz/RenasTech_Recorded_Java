package day03_variablesContinue;

public class c5_relationalOperators {
    public static void main(String[] args) {


        byte b1=10;
        byte b2=25;

        // == equal operators
        boolean exp= b1==b2;
        System.out.println(exp==false); //  F==F,so result will be T

        //  != not equal , opposite of equal operator
        System.out.println(b1!=b2);  //T

        //  > means greater
        System.out.println(b1>b2);   //F

        //  < means smaller
        System.out.println(b1<b2);   //T

        //  >= means bigger or equal
        System.out.println(10>=10 );  //T

        //  <= means smaller or equal
        System.out.println(10<=5);   //F




    }
}
