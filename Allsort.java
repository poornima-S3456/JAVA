public class Allsort {
    public static void SelectionSort( int arr[]){

        for( int turn=0;turn<arr.length-1;turn++){

            int minPos = turn;
            for( int j=turn+1;j<arr.length;j++){

                if( arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //swapping
            int temp = arr[minPos];
            arr[minPos ]= arr[turn];
            arr[turn]=temp;
        }
    }

   
    
   
   
    public static void main( String args[]){
        int arr[]={ 3,5,6,7,2,8,9};

        SelectionSort(arr);
        for( int i=0;i<arr.length;i++){
            System.out.print( arr[i]+" ");
        }
      
}
}
