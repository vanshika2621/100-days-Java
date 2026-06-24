//Find the area of a rectangle.

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the Length: ");
        float length = scanner.nextFloat();
        System.out.print("Enter the Width: ");
        float width = scanner.nextFloat();
        float area = length * width; 
        System.out.println("The area of the rectangle is: " + area); 
        scanner.close();
        

    }
}
