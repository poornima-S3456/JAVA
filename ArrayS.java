public class ArrayS {
    public static void main( String args[]){
        int[] arr1 = { 1,2,3,4,5};
        int[] arr2 = { 1,2,3,4,5};
        // //int[]  sum = { 2,4,6 ,8,10};
        // int sum=0; 
        // for( int i=0;i<arr1.length;i++){
            
        //    sum = sum+ arr1[i]+ arr2[1];
        // }
        //    System.out.println( sum);
    // int[]sum= new int[ arr1.length];
    // for( int i=0; i<arr1.length;i++){

    //     sum[i] = arr1[i]+arr2[i];
    // } 
    // for( int i=0; i<5; i++){
    //     System.out.println( sum[i]);

    for( int i=0;i<5;i++){
        for( int j=0;j<5;j++){
        if( arr1[i]==arr2[j]){
           
            System.out.println( arr1[i]);
        }
     
    }
}
}
}