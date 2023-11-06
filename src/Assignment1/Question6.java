package Assignment1;

import java.util.Scanner;

//Write a program which calculates marks on basis of given grades in java using switch statement
//if Grade A then marks >=80
//if Grade B then marks >=60 and less than 80
//if Grade C then marks >=40 and less than 60
//if Grade F then marks <=40
//if any other grade is passed then print invalid grade
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Grade: ");
        char grade = scanner.next().charAt(0);
        gradeCalculate(grade);
    }


    public static void gradeCalculate(int grade){
        switch (grade) {
            case 'A':
                System.out.println("Marks >= 80");
                break;
            case 'B':
                System.out.println("Marks >= 60 and < 80");
                break;
            case 'C':
                System.out.println("Marks >= 40 and < 60");
                break;
            case 'F':
                System.out.println("Marks <= 40");
                break;
            default:
                System.out.println("Invalid grade");
        }

    }
}
