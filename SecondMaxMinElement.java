//Find the second largest element. 


public class SecondMaxMinElement{
    public static void main(String[] args){
        int[] arr ={26,21,5,1,61,16};
        int size = arr.length ;
        int max = arr[0];
        int min = arr[0];
        int Secondmax = arr[0];
        int Secondmin = arr[0];

        for(int i =1 ;i< size ; i++ ){
            if (arr[i]> Secondmax) {
                Secondmax = max ;
                max = arr[i]; 

            }
            if(arr[i]< Secondmin){
                Secondmin = min;
                min = arr[i];
            }
        }
        System.out.println("second Largest array is " + Secondmax);
        System.out.println("second Smallest of array is " + Secondmin ); 
    
}
}