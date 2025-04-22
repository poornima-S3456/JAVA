import java.util.*;

public class sum {



//  public static int getlargest ( int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         for( int i=0;i<numbers.length;i++ ){
//             if( largest < numbers[i]){
//                 largest = numbers[i];
//             }
        

//         }
//         return largest;

//     }

public static  boolean evenOrodd(int numbers[]){
    for(int i=0;i<=numbers.length;i++){
        if(numbers[i]%2 ==0){
        return true;
        }
   
    }
    return false;
}


    public static void main( String[] args){
     int numbers[]={ 3,5,7,9,5,7,14,15};
        
        System.out.println(evenOrodd(numbers));
    }
}



//         int a = 121;
//        int sum=0;
//         int original = a;
//         int res = 0;

//         while( a>0){

//             int digit =a%10;
      //      res = res*10+ digit;
//            sum =sum+digit;
//             a=a/10;
//         }
//         System.out.println( res);
//         System.out.println(sum);

// //array
    
//     int arr[]={ 0,1,2,3,4,5};
//    // System.out.println( arr[4]);
//    for( int i=0;i<arr.length;i++){
//        System.out.println( arr[i]);
//     }

// Scanner sc = new Scanner(System.in);
// System.out.println( " enter the size of array");
// int n = sc.nextInt();
// int arr[]= new int[n];
// System.out.println( " enter value of array");
// for( int i=0;i<n;i++){

//     arr[i] =sc.nextInt();
// }
// for( int k=0; k<arr.length;k++){
//     System.out.println(arr[k]+ " ");
// }



   //    }
 //   }
   

