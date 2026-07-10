//Check if a number is a palindrome.

import java.util.Scanner;

public class Palindrome{
    public static void main(string[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num = sc.nextInt();
        int digit = 0;
        int rev = 0;
        while(num>0){
            digit = num%10;
            rev = rev + digit;
            num = num/10;
        }
        sc.close();
    }
}