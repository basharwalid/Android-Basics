package Assignment1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter The Watermelon Weight");
        int weight = scanner.nextInt();

        canBeDivided(weight);
    }

    public static void canBeDivided(int weight){
        if(weight >=4 && weight%2 == 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
