//Find the largest of two numbers.

import java.util.Scanner;

public class LargestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is the largest number. ");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number. ");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
    
