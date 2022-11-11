package Assignment_6;/*Write  a code   string   array    with   the   following   strings:
"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared. */
public class Homework30 {
    public static void main(String[] args) {

String [] weekDays= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        for (int i = 0; i < weekDays.length; i++) {
            System.out.println("The day of the week is : " +weekDays[i]);
        }
    }
}
