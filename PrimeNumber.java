// Create a method to check if a number is prime.

public class PrimeNumber {
    //Method to check if a number is prime
    public static int Prime(int num){
        if(num<=2|| num%2 == 0){
            System.out.println("Not a Prime number ");
        }
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num%i==0){
                System.out.println("Not a Prime number ");
            }
        }
        System.out.println("Prime number ");
        return num;
    }
}