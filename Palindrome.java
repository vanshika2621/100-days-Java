//Check if a number is a palindrome.

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int digit = 0;
        int rev = 0;
        while(num>0){
            digit = num%10;
            rev = rev * 10 + digit; 
            num = num/10;
        }
        System.out.println("The reverse of the number is: " + rev);
        if (originalNum == rev){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}