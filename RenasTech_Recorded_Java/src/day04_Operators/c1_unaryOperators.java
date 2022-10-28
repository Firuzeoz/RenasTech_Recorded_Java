package day04_Operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class c1_unaryOperators {
    //  +
    // -
    // ++
    // --
    public static void main(String[] args) {

        int num1=20;
        int num2=15;
        int num3= +num1;  // num3 is equal num1 ,instead of num3=20 we said like that
        int num4= -num1; //   int num4= -20
        System.out.println("Number 3 is : "+num3);
        System.out.println("Number 4 is : " +num4);

        int x=10;
        int y=-x; // instead of int y = -10 , we declared like that
        System.out.println(y);

        boolean b1= y>=0 ;  // -10 > 0 false
        boolean b2= x>=0;   // 10>=0 true
        System.out.println(b1);
        System.out.println(b2);

        // if you have   + before variable, it won't affect the number
        // if you have   - before variable, it will make your number opposite

        int i1=-15;
        int i2=+i1;   //-15
        int i3=i1 + -i1;  //0
        int i4= -i1; // 15
        int i5= -i3;  // 0
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);


    }
}
