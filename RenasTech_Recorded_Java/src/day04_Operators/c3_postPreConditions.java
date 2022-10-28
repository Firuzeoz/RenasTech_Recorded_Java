package day04_Operators;

public class c3_postPreConditions {
    public static void main(String[] args) {

        int x=10;
        System.out.println(x);
        System.out.println(++x);  // pre condition: will increase your number by 1 immediately
        System.out.println(x); // x=11
        System.out.println(+x); // output will be +11 // one plus not affect pos or neg.


int y=20;
        System.out.println(y);
        //post cond ,wont affect the number right away, it will affect in next line
        System.out.println(y++);  //20
        System.out.println(y); //21


byte number1=30;
        System.out.println(number1); //30
        System.out.println(--number1); //29

        int number2=50;
        System.out.println(number2--); //50
        System.out.println(number2--); //49
        System.out.println(number2--); //48
        System.out.println(--number2); //46
        System.out.println(--number2); //45
        System.out.println(number2); //45
        System.out.println(number2++); //45
        System.out.println(number2++); //46
        System.out.println(++number2); //48
        System.out.println(number2++); //48
        System.out.println(++number2); //50
        System.out.println(number2); //50




    }
}
