public class Sorting {
    public static void BubbleSort( String str[]){
        for( int turn = 0; turn<str.length-1;turn++){
            for( int j=0;j<str.length-1-turn;j++){
                if( str[j].toLowerCase().charAt(0)> str[j+1].toLowerCase().charAt(0)){
                 String temp = str[j];
                   str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
    }

    public static void Arrprint( String str[]){

        for( int i=0;i<str.length;i++){
            System.out.print(str[i].toLowerCase().charAt(0)+" ");
        }
        System.out.println();
    }




  


    public static void main( String args[]){

      String str[]= {"A","F","E"};
      BubbleSort ( str);
        Arrprint(str);
    }
    
}
