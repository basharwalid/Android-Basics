package Assignment1;
//In this Program we are making a simple calculator that performs addition, subtraction, multiplication
//and division based on the user input. The program takes the value of both the numbers (entered by
//user) and then user is asked to enter the operation (+, -, * and /), based on the input program
//performs the selected operation on the entered numbers

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read both Numebrs from the user
        System.out.println("Please Enter the first Number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Please Enter the Second Number");
        double secondNumber = scanner.nextDouble();

        //read operator
        System.out.println("Select operation Number \n 1-Addition \n 2- Subtract \n 3- multiplcation \n 4-Division");
        int operator = scanner.nextInt();

        //function calling
        calculator(firstNumber , secondNumber , operator);
    }

    public static void calculator(double firstNumebr , double secondNumber , int operator){
            double result = 0;
            String InvalidInput ="";
            if(operator == 1){
                result = firstNumebr +secondNumber;
            }else if(operator == 2){
                result = firstNumebr - secondNumber;
            } else if (operator == 3) {
                result = firstNumebr * secondNumber;
            } else if (operator == 4) {
                result = firstNumebr/secondNumber;
            }else {
                InvalidInput = "Invalid Input";
            };
        System.out.println("Result =" + result);
    }
}
