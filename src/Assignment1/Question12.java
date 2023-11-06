package Assignment1;

import java.util.Scanner;
import java.lang.Math;

//Write a Java program to print the area of a circle.
public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The radius");

        double radius = scanner.nextDouble();

        System.out.println(calculateArea(radius));
    }


    public static double calculateArea(double radius){
        return Math.PI * Math.pow(radius ,2);
    }

}
