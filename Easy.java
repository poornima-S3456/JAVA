import  java.util.*;
public class Easy {
    public static void main( String[] args){
        Scanner sc = new Scanner( System.in);
        //3

        System.out.println( " enter the number of a");
        int a = sc.nextInt();
        System.out.println( " enter the number of b");
        int b = sc.nextInt();
        if(a>b) {
            System.out.println( "a is greatest");
        }
        else{
            System.out.println("b is greatest");
        }
        
        System.out.println();

        //4
        System.out.println( "enter any alphabate");
        char ch = sc.next().charAt(0);
        switch(ch){
            case'a':
            case'e':
            case'i':
            case'o':
           case'u':
           System.out.println( " vowel");
           break;
           default:
           System.out.println( " consonant");

        
    }
}
    
    
}
