package day04_Operators;

public class c2_task {
    public static void main(String[] args) {

        /*
        * Create 3 different number
        * second num should be  = first num + 7
        * third num should be = second num +8

        * */
int i1=100;
int i2=i1+7;
int i3= i2+8;
        System.out.println("i1 is: "+i1+"\ni2 is: "+i2+"\ni3 is: "+i3);

        int sum=i1+i2+i3;
        System.out.println("Sum of the numbers is: "+ sum); //result 322
        System.out.println("Sum of the numbers is: " +(i1+i2+i3));//don't forget parenthesis, result 322
        System.out.println("Sum of the numbers is: " + i1+i2+i3); // if you forget it,it won't calculate ,it'll concat
                                                                  //result 100107115

    }
}
