//Remove duplicate elements.
import java.util.Arrays ;

public class RemoveDuplicate{
    public static void main(String[] args){
        int[] arr ={26,21,5,1,5,1,61,16};
        int size = arr.length ; 
        int[] sorted = new int[size]; 
        // Array sort 
        Arrays.sort(arr); 
        int b = 0;
        for(int i= 1 ; i<size ; i++){
            if(arr[i] == arr[i+1]){
                // Skip the duplicate element
                continue;

            }
            sorted[b] = arr[i];
            b++; 
        }
        // Print the array without duplicates
        for(int i= 0 ; i<b ; i++){
            System.out.print(sorted[i] + " ");
        }
    }
}