import java.util.*;
public class Pattern{

    public static void main( String[] args){

        Scanner sc = new Scanner( System.in);
        System.out.println( " enter the numbers of rows");
        int rows = sc.nextInt();
        for(int i=0;i<=rows;i++){

            for(int j=i; j<=rows-i; j++){
               
                System.out.print( "*");
            }
            for( int k=1;k<=i;k++){
            System.out.print( " ");
        }
        System.out.println( " ");
        
    }

}
}