//Print Hello world and sum of two numbers
import java.util.Scanner ;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.println("Sum Of two numbers"); 
        int sum = a + b ;
        System.out.println(sum);
        sc.close(); 
    }
    
}
