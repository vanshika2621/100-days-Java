//Find the maximum and minimum elements.

public class MAXMIN{
    public static void main(String[] args){
        int[] arr ={26,21,5,1,61,16};
        int size = arr.length ;
        int max = arr[0];
        int min = arr[0];

        for(int i =1 ;i< size ; i++ ){
            if (arr[i]> max) {
                max = arr[i];

            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Maximum of array is " + max );
        System.out.println("Minimum of array is " + min ); 
    
}
}