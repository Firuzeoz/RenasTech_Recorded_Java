/*-Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
- based on the point the code should automatically determine the grade of Student with the full name of the student
- This should be done for each student
- Assuming we do not know how many student are there but your code should still handle this situation
- example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
- When the point is between 90 to 100 the grade should be A
- When the point is between 80 to 90(excluded) the grade should be B
- When the point is between 70 to 80(excluded) the grade should be C
- When the point is between 60 to 70 (excluded) the grade should be D
- When the point is less than 60 the grade should be F
- Example output (First Name = Ziya Last Name = Yilmaz Grade: A ) */
package Assignment_3;
import java.util.Scanner;
public class Task4_hw12 {
    public static void main(String[] args) {
       Scanner scan3=new Scanner(System.in);
        System.out.println("Please enter the Student's firstname: ");
        String fName=scan3.nextLine();
        System.out.println("Please enter the student's lastname: ");
        String lName=scan3.nextLine();
        System.out.println("Please enter the student's grade: ");
        double sGrade=scan3.nextDouble();

       if (sGrade>=90 && sGrade<=100){
       System.out.println("First Name = "+fName+" Last Name = "+lName+ " Grade: A");
       } else if (sGrade>=80 && sGrade<90){
            System.out.println("First Name = "+fName+" Last Name = "+lName+ " Grade: B ");
        } else if (sGrade>=70 && sGrade<80){
            System.out.println("First Name = "+fName+" Last Name = "+lName+ " Grade: C " );
        } else if (sGrade>=60 && sGrade<70){
            System.out.println("First Name = "+fName+" Last Name = "+lName+ " Grade: D ");
        } else if (sGrade<60 ){
            System.out.println("First Name = "+fName+" Last Name = "+lName+ " Grade: F ");
        }else {
            System.out.println(" -- Invalid data -- ");
       }  } }
