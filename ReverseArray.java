//Reverse an array.

import java.util.Arrays ;  

public class ReverseArray{
    public static void main(String[] args){
        int[] arr ={26,21,5,1,61,16};
        int size = arr.length ;
        int[] rev = new int[size] ; 
        int j = 0 ;
        for(int i =size-1 ;i>=0 ; i-- ){
            rev[j] = arr[i] ;
            j++;
            
        }
        System.out.println(Arrays.toString(rev)); 
    }
}