import java.util.*;
public class Example {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( " enter any number");

        int n = sc.nextInt();

        //check even or odd
        if( n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println( "odd");
        }

        // check positive negative or zero

        if( n>0){
            System.out.println( " positive number");
        }
        else if( n<0){
            System.out.println( " negative number");
        }
        else{
            System.out.println( "Zero");
        }
        

        }
    }
    

