class student{

   int rollnumber;
   String name;
   int  marks;
   
    void showRollnumber(int rollnumber ){
        System.out.println( " Rollnumber :"+rollnumber);
    }


    void showName( String name){
        System.out.println("Name :"+ name);
    }


    void showMarks( int marks){
        System.out.println( " Marks :"+marks );
    }

}

class Car{

   String fieldsbrand;
    String model;
    int price ;

    void showfieldsbrand( String fieldsbrand){
        System.out.println(" FieldsBrand :"+ fieldsbrand  );
    }

    void showModel( String model){

        System.out.println("Model :"+ model);
    }

    void showPrice( int price){

        System.out.println( " Price :"+ price);
    }

}




class areaofRactangle{

    int length = 6;
    int width = 5;
   void  area(){
    System.out.println(length*width);

   }


}


public class oops {

    

    public static void main(String args[]){
    //    student st = new student();
    //    student st1 = new student();
    //    student st2 = new student();
    //    st.showName( "poornima");
    //    st.showRollnumber( 246);
    //    st.showMarks( 90);

      
    //    st.showName( "pratha");
    //    st.showRollnumber( 345);
    //    st.showMarks( 78);
       
    //    st.showName( "rashika");
    //    st.showRollnumber( 987);
    //    st.showMarks( 88);


    //    areaofRactangle r =new areaofRactangle();
    //   r.area();

    Car c = new Car();
    c.showfieldsbrand( "BMW");
    c.showModel(" hero" );
    c.showPrice( 550000);
   
    
}
}
