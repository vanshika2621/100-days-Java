//Find the sum of all elements.
 


public class SumOfArray{
    public static void main(String[] args){
        int[] arr ={26,21,5,1,61,16};
        int size = arr.length ;
        int sum = 0 ;

        for(int i =0 ;i< size ; i++ ){
            sum = sum + arr[i] ;
        }
        System.out.println("The Sum of array is " + sum );
    }
}