package day03_variablesContinue;

public class c3_String {
    //String is non-primitive data type

    public static void main(String[] args) {

        //dataType variableName=data;
             String nameStudent="Ozgur";  //text
              String nameSchool="RenasTech";   //text
                  int studentId=1234;  // output will be a number
                  String stId="1234"; // output will be text

        System.out.println("Name of Student: " + nameStudent+"\nName of the School: "+ nameSchool +"\nStudent (text)Id: "+studentId+"\nStudent (String) Id: "+stId);

String num1="100";
byte num2=100;
        System.out.println(num1+10); // text +num , result will be concat like this 10010
        System.out.println(num2+10); //num+num will be calculating ,result is 110
    }
}
