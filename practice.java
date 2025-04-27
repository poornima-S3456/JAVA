public class practice {

public static void findequal(String str1, String str2 ){

    for( int i=0;i<str1.length();i++){

for( int j=0;j<str2.length();j++){

    if( str1.charAt(i)==str2.charAt(j)){

        System.out.println( str1.charAt(i));
    }
}
    }
}

public static boolean palindrom( String str){
    
    for( int i=0;i<str.length()/2;i++){
        int n = str.length();

        if( str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
       
   
}
return true;
}

public static void comparechar( String str){
    char arr[] = str.toCharArray();
    char target = 'p';
     int count =0;
    for( int i=0;i< arr.length;i++){
        if( arr[i]==target){
            count++;
        }
    }
    System.out.println( count);
}

public static void countvowel( String str){
    int count =0;
    for( int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if( ch=='a'||ch =='e'|| ch=='i'|| ch=='o'||ch=='u' )
        count++;
    }
    System.out.println( count);

}





    public static void main( String args[]){

        String str1 = "poornima";
       String str2 = " rashika";
       findequal( str1,str2);
       findequal(str1, str2);
      
     System.out.println( palindrom(str1));
      String str = " poornima";
      comparechar( str);
      countvowel(str1);



       
    }
}

