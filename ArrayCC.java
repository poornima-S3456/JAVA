

import java.util.*;

public class ArrayCC {
    public static void printSubrrays(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for( int j=i ; j<numbers.length; j++){
                int end = j;
                for( int k= start; k<=end; k++){
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }

    public static void main( String[] args){
        int numbers[]= { 2 ,4 ,6 ,8, 10,12,14,18,20,22};
        System.out.println(numbers);
        printSubrrays(numbers);

    }
}
