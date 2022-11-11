package Assignment_4;
import java.util.Scanner;
public class Task2_hw15 {/*Write a Code where user is being asked to enter a sentence
      if Sentence starts with "B" or "b" and ends with "E" or "e" also contains "A" or "a"
      replace second and fourth characters with "G"*/
        public static void main(String[] args) {
        System.out.println("Please enter a sentence : ");
        Scanner scan=new Scanner(System.in);
        String sent=scan.nextLine();
        if (((sent.startsWith("B") || sent.startsWith("b")))
        &&(sent.endsWith("E") || sent.endsWith("e"))
        || (sent.contains("A") ||sent.contains("a"))){
            String subSent=(sent.substring(0,1)+'G'+sent.substring(2,3)+'G'+sent.substring(4));
                        System.out.println("New sentence: "+subSent);
                    }else{
                        System.out.println("Original sentence: "+sent);
                    }
                 }
        }







