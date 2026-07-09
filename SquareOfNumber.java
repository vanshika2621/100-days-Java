//Create a method to find the square of a number.

import java.util.Scanner;

public class SquareOfNumber{
    //Method to find the square of a number
     public static int SquareOfNumbers(int x){ 
            return x*x; 
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter any number: ");
        int  a = sc.nextInt();

        int square = SquareOfNumbers(a); 
        System.out.println("Square of the number is: " + square) ;

        sc.close();

        
    }
}
