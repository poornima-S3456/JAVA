public class ArrayS {

  public static void NaturalNo( int num){//code1
  for( int i=0;i< num;i++){

   
    System.out.println(i);
  }

 


  }

  public static void ReverseNo( int n){   //code2

    for( int i=n;i>0;i--){
      System.out.println( i);
    }
  }


  public static void Evenodd( int n ){  //3

    for( int i=0;i<n;i++){
      if( i%2==0){
        System.out.println( "even");
      }
      else{ 
        System.out.println( "odd");
      }

    }
    
  }
  

  public static void Sumof(int n){

    int sum=0;
    for(int i=0;i<=n;i++) {
      sum=sum+i;
    }
    System.out.println(sum );
  }

  public static void Productof( int num){
      int product = 1;
    for( int i=0;i<=num;i++){
      product = product*i;

    }
    System.out.println( product);
  }


  public static void main( String args[]){


    // NaturalNo( 10);
    // ReverseNo( 12);
    // Evenodd( 8);
    // Sumof(4);
    Productof( 4);
}
}