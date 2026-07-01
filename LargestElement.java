//Find the largest element in an array. 

import java.util.Scanner;

public class LargestElement{
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,4,5,8,9,10,45, 26, 21} ;
        int size = arr.length ;
        int temp = arr[0];
        for(int i=0 ; i< size ; i++){
            if(arr[i] > temp){
                temp = arr[i] ;
            }
        }
        System.out.println("Largest element in the array is: " + temp );


    
        
        sc.close(); 
    }
}