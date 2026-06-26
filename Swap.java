//Swap two numbers (with and without a third variable). 

import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number 'a': ");
        int a = sc.nextInt();
        System.out.println("Enter Second number 'b': ");
        int b = sc.nextInt(); 
        int c = a  ;
        a = b ;
        b = c ; 
        System.out.println("After swapping: ");
        System.out.println("First number 'a': " + a);
        System.out.println("Second number 'b': " + b);

        sc.close(); 

    }
}