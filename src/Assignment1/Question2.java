package Assignment1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Month Number");
        int monthNumber = scanner.nextInt();
        System.out.println(getMonthSeason(monthNumber));
    }

    public static String getMonthSeason(int monthNumber){
        if(monthNumber == 1 || monthNumber == 2 || monthNumber ==12) return "Winter";
        else if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5) return "Spring";
        else if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8) return "Summer";
        else if(monthNumber == 9 || monthNumber == 10 || monthNumber ==11) return "Autumn";
        else return "Sorry there's only four Seasons in the 12 months :(";
    }

}
