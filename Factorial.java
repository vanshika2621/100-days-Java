// Find the factorial of a number.

import java.util.Scanner ;

public class Factorial{
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int N = sc.nextInt();
        int factorial=1; 
        for(int i= 1 ; i<=N; i++){
            factorial = factorial * i ;
        }
        System.out.println("Factorial of " + N + " is: " + factorial);
        sc.close();
    }
}