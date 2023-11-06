package Assignment1;

import java.util.Scanner;

//The alphabets A, E, I, O and U (smallcase and uppercase) are known as Vowels and rest of the
//alphabets are known as consonants. Here we will write a java program that checks whether the
//input character is vowel or Consonant.
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Month Number");
        char letter = scanner.next().charAt(0);
        System.out.println(isVowel(letter));
    }

    public static String isVowel(char letter){
        if(letter == 'A' || letter == 'a' || letter == 'E' || letter =='e' || letter == 'O'
                || letter == 'o' || letter == 'U' || letter == 'u' || letter == 'I' || letter =='i') return "It's a Vowel";
        else return "It's Consonant";
    }
}
