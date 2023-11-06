package Assignment1;

import java.util.Scanner;
// Write a program that reads in three Floating-point numbers and sort them
public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The first Number");
        float firstNumber = scanner.nextFloat();
        System.out.println("Please Enter The Second Number");
        float secondNumber = scanner.nextFloat();
        System.out.println("Please Enter The Third Number");
        float thirdNumber = scanner.nextFloat();

        sortingNumber(firstNumber , secondNumber , thirdNumber);
    }

    public static void sortingNumber(float firstNumber , float secondNumber , float thirdNumber){
        float temp;
        if(firstNumber>secondNumber){
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        if(secondNumber > thirdNumber){
            temp = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = temp;
        }
        if (firstNumber>secondNumber) {
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        System.out.println("Sorted Number = \n" + firstNumber+"\n"+secondNumber+"\n"+thirdNumber);
    }
}
