import java .util.*;

public class Loop {
    public static void main( String[] args){

          //first...
        for( int i=1; i<=10; i++ ){
           System.out.print( i + " ");
            
        }
        System.out.println();

        int i =1;
        while( i<=10){
           System.out.print(i + " ");
             i++;
        }

        //second..
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();

       if( n%2 == 0){
        System.out.println("even");
       }
       else{
      System.out.println( " odd");
      }

     //third
    if( n>0){
        System.out.println( " positive");
    }
    else if( n<0){
     System.out.println( " negative");
    }
    else{  
             System.out.println( " zero");
    }

      //fourth
   int a = sc.nextInt();
     int b = sc.nextInt();
    
     if( a>b){
        System.out.println( "a= " + a);
    }
    else{
        System.out.println( " b=" + b);
   }

      //fifth..
     char ch = sc.next().charAt(0);
     switch( ch){
        case 'a':
         case 'e':
         case 'i':
       case 'o':
         case 'u':
         System.out.println("vowel");
         break;
         default:
         System.out.println(" consonent");
       
     }


    for( int i=1;i<=n;i++){
         System.out.println(i);
     }
    
    for( int i =1; i<10;i++){
         int table = n*i;
        System.out.println( n+ " * "+i+ " = " +table  );
     }
    
   if( n % 5==0 && n%11 ==0){

        System.out.println( " divisible by 5 and 11");
   }
   else{
     System.out.println( " does not  divisible");
   }
 int r = sc.nextInt();
 int fact =1;
 for( int i=1; i<=r; i++){
    fact = fact*i;
   
 }
 System.out.println(fact);


if( n%3==0){
    System.out.println("multiple of 3");
}
else{
    System.out.println( "does not by 3");
}

     
 }
}




