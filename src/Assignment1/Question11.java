package Assignment1;

import java.util.Scanner;

//write a program to calculate the sum of positive integers and sum of negative integers for 6 integers.
public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please Enter The Second Number");
        int secondNumber= scanner.nextInt();
        System.out.println("Please Enter The Third Number");
        int thirdNumber= scanner.nextInt();
        System.out.println("Please Enter The fourth Number");
        int fourthNumber= scanner.nextInt();
        System.out.println("Please Enter The fifth Number");
        int fifthNumber= scanner.nextInt();
        System.out.println("Please Enter The sixth Number");
        int sixthNumber= scanner.nextInt();

        System.out.println("The Sum of positive Number = "+sumOfPos(firstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber,sixthNumber));
        System.out.println("The Sum of Negative Number = "+sumOfNeg(firstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber,sixthNumber));
    }

    //function to find the sum of Positive Numbers
    public static int sumOfPos(int firstNumber, int secondNumber,int thirdNumber
            ,int fourthNumber,int fifthNumber,int sixthNumber){
        int result =0;
        if(firstNumber>0){
            result+=firstNumber;
        }  if (secondNumber>0) {
            result+=secondNumber;
        } if(thirdNumber>0){
            result+=thirdNumber;
        }  if (fourthNumber>0) {
            result+=fourthNumber;
        }  if (fifthNumber>0) {
            result+=fifthNumber;
        } if(sixthNumber>0){
            result+=sixthNumber;
        }
        return result;
    }

    //function to find the sum of negative Numbers
    public static int sumOfNeg(int firstNumber, int secondNumber,int thirdNumber
            ,int fourthNumber,int fifthNumber,int sixthNumber){
        int result =0;
        if(firstNumber<0){
            result+=firstNumber;
        }  if (secondNumber<0) {
            result+=secondNumber;
        } if(thirdNumber<0){
            result+=thirdNumber;
        }  if (fourthNumber<0) {
            result+=fourthNumber;
        }  if (fifthNumber<0) {
            result+=fifthNumber;
        } if(sixthNumber<0){
            result+=sixthNumber;
        }
        return result;
    }
}
