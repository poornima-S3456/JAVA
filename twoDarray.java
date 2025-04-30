import java.util.*;

public class twoDarray{




    //print spiral matrix

    public static void printspiral( int matrix[][]){

        int stRow = 0;
        int stCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while( stRow<=endRow && stCol<=endCol){

            for( int j=stCol;j<=endCol;j++){     //top
                System.out.print( matrix[stRow][j]+" ");
            }

            for( int i=stRow+1;i<=endRow;i++){  //right

                System.out.print( matrix[i][endCol]+" ");
            }

            for( int j=endCol-1;j>=stCol;j--){  //bottom
                        if(stRow==endRow){
                            break;
                         }
               
                System.out.print( matrix[endRow][j]+" ");
            }

            for( int i=endRow-1;i>=stRow+1;i--){   //left
                if( stCol==endCol){
                    break;
                }
                

                System.out.print( matrix[i][stCol]+" ");
            }
            stCol ++;
            stRow ++;
            endCol --;
            endRow --;

        }
        System.out.println();



    } 

    public static int diognalsum( int matrix[][]){

        int sum =0;
        for( int i=0;i<=matrix.length;i++){

            for( int j=0;j<=matrix.length-1;j++){

                if(i==j){
                    sum+=matrix[i][j];
                }
                else if( i+j==matrix.length-1){
                    sum+=matrix[i][j];

                }
            }
        }
        return sum;
    }

    public static void main( String args[]){       //creat 2D array

        //  int matrix[][]= new int [3][3];
        //  int n =matrix.length, m= matrix[0].length;

        //  Scanner sc = new Scanner( System.in);
        //  for( int i=0;i< n;i++){

        //     for( int j=0;j<m;j++){

        //         matrix[i][j]= sc.nextInt();
        //     }
        //  }

        //  for( int i=0;i<n;i++){
        //     for( int j=0;j<m;j++){

        //         System.out.println( matrix[i][j]+"  ");
        //     }
        //     System.out.println();
        //  }
         
         int matrix[][] = {{1,2,3,4},
                           {5,6,7,8},
                           { 9,10,11,12},
                           { 13,14,15,16}};


         printspiral( matrix); 
         System.out.println(diognalsum(matrix));
        }


    
}