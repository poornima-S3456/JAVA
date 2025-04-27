public class Main {
    public static void main( String args[]){

        // String str = "hhiiii";
        // String newstr = " ";
        // for( int i=0;i<str.length();i++){

        //     char c= str.charAt(i);
        //     if( newstr.indexOf(c)==-1){
        //         newstr = newstr+c;
        //     }
        // }
        // System.out.println( newstr);
      


    //    String str1 = "helloo";
      
    //    char[] arr1 = str1.toCharArray();
       
    //    for( int i=0;i<str1.length();i++){
    //     for( int j=i+1;j<str1.length();j++){        
    //     if(  arr1[i]==arr1[j]){
    //         System.out.println( arr[i]);
    //         return;
            
            
            
    //     }
       
       
    //    }
    // }



    String str3 = "byeeiiww";
    char[] arr = str3.toCharArray();
    String str4 = "";
    int count = 0;
   for( int i=0;i<str3.length(); i++){
    //for( int i= str3.length();i>0;i--){

       for( int j=i+1;j<str3.length();j++){
     // for(int j = str3.length();j>i+1; j--  ){
             
            if( arr[i]==arr[j]){
                count++;

                if( count ==1){
                    str4 = str4+arr[i];
                    System.out.println( str4);
                     return;
                }
              break;

            }
            
           
        }
        
    }



   String str9 = "poornima";
   String rev ="";
    for( int i=str9.length();i>=0;i--){
rev = rev + str9.charAt(i);

    }
    System.out.println( rev);

    
    
}
}

