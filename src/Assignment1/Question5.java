package Assignment1;

import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative.
public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter A Number");
        int number = scanner.nextInt();

        System.out.println(IsPositive(number));
    }

    public static String IsPositive(int number){
        if(number>0)return "The Number is positive";
        else return "Numebr is Negative";
    }
}
