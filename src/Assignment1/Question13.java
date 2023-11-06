package Assignment1;

import java.util.Scanner;

//Take three numbers from the user and print the greatest number.
public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter First Number");
        int firtNumber = scanner.nextInt();
        System.out.println("Please Enter Second Number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please Enter Third Number");
        int thirdNumber = scanner.nextInt();

        greatestNumber(firtNumber, secondNumber,thirdNumber);
    }

    public static void greatestNumber(int firstNumber , int secondNumber  ,int thirdNumber){
        if(firstNumber>secondNumber){
            if (firstNumber>thirdNumber){
                System.out.println("Max = "+firstNumber);
            }
        }
        if (secondNumber>thirdNumber){
            if(secondNumber>firstNumber){
                System.out.println("Max = "+secondNumber);
            }
        }
        if(thirdNumber>firstNumber){
            if(thirdNumber>secondNumber){
                System.out.println("Max = "+thirdNumber);
            }
        }
    }
}
