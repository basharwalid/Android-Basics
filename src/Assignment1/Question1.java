package Assignment1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

// Write a java program that read a number of the month And then print the name of it
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Month Number");
        int monthNumber = scanner.nextInt();
        System.out.println(getMonthName(monthNumber));
    }
        public static String getMonthName(int monthNumber) {
            if (monthNumber == 1) return "January";
            else if (monthNumber == 2) return "Fabruary";
            else if (monthNumber == 3) return "March";
            else if (monthNumber == 4) return "April";
            else if (monthNumber == 5) return "May";
            else if (monthNumber == 6) return "June";
            else if (monthNumber == 7) return "July";
            else if (monthNumber == 8) return "August";
            else if (monthNumber == 9) return "September";
            else if (monthNumber == 10) return "October";
            else if (monthNumber == 11) return "November";
            else if (monthNumber == 12) return "December";
            else return "No Month Called is Like That :)";
        };


}
