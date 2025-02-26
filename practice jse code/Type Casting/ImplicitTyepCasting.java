public class ImplicitTyepCasting {
    public static void main(String arg[])
    {
        int a=10;
        long l=a;        //int to long
        double d=a;      //int to double
        float f=a;       //int to float 
        //byte b1=a; error
        System.out.println("Convert int to other datatype");  
        System.out.println(a);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);
       

        byte b=127;
        int i=b;
        float f1=b;
        double d1=b;
        long l1=b;
        
        System.out.println("Convert byte type to other data types");
        System.out.println(b);
        System.out.println(i);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(l1);

        


       
      
    } 
    
}
