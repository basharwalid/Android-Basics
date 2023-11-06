package Assignment1;

import java.util.Scanner;

//How Can Find The Minimum/maximum of three numbers using conditional operator
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The First Number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please Enter The Second Number");
        int secondNumber= scanner.nextInt();
        System.out.println("Please Enter The Third Number");
        int thirdNumber= scanner.nextInt();
        findMax(firstNumber , secondNumber, thirdNumber);
        findMin(firstNumber , secondNumber, thirdNumber);
    }

    public static void findMax(int firstNumber , int secondNumber , int thirdNumber){
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
    public static void findMin(int firstNumber , int secondNumber , int thirdNumber){
        if(firstNumber<secondNumber){
            if (firstNumber<thirdNumber){
                System.out.println("Min = "+firstNumber);
            }
        }
        if (secondNumber<thirdNumber){
            if(secondNumber<firstNumber){
                System.out.println("Min = "+secondNumber);
            }
        }
        if(thirdNumber<firstNumber){
            if(thirdNumber<secondNumber){
                System.out.println("Min = "+thirdNumber);
            }
        }

    }
}
