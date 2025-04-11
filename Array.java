import java.util.*;

public class Array {
    
    public static void main( String[] args){
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt(); 
        switch(a){
            case 1:
            System.out.println(" Monday");
            break;
             case 2:System.out.println( "tuesday");
            break;
           case 3: System.out.println( "wednesday");
            break;
           case 4: System.out.println( " thusday");

            break;
             case 5 :System.out.println( " friday");
            break;
           case 6:  System.out.println( " saturday");
            break;
            case 7: System.out.println( " sunday");
            break;
            default: System.out.println( "invalid");
            break;
     }

    int b = sc.nextInt();
    int c = sc.nextInt();
    char d = sc.next().charAt( 0);
    switch(d){
        case '+':
        System.out.println( " Addition" +(b+c));
        break;
        case '-':
        System.out.println("subtraction" + (b-c));
        break;
        case'*':
        System.out.println( " Multiplication" +(b*c) );
        break;
        case '/':
        System.out.println( " division" +( b/c));
        break;
        default:
        System.out.println( " invalid");
        


    }

    int n = sc.nextInt();
    switch(n){
        case 1:
        System.out.println( "one");
        break;
        case 2:
        System.out.println( " two");
        break;
        case 3:
        System.out.println( "Three");
        break;
        case 4:
        System.out.println( " Four");
        break;
        case 5:
        System.out.println( "Five");
        break;
        case 6:
        System.out.println( " six");
        break;
        case 7:
        System.out.println( "Seven");
        break;
        case 8:
        System.out.println( " Eight");
        break;
        case 9:
        System.out.println( " Nine");
        break;
        default : 
        System.out.println( " ab na ho payegaaaaaa");

    }



        
        }
    }
   
    

