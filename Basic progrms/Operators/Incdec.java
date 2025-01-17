public class Incdec {
    public static void main(String arg[])
    {
        int a=10;
        System.out.println(a);           //10
        System.out.println("Pre-Post increment");
        System.out.println(++a);   //pre increment         1+10=11
        System.out.println(a++);   //post increment         11+1=12 but display 11      
        System.out.println("Pre-post decrement");
        System.out.println(--a);    //pre decrement         12-1=11
        System.out.println(a--);     //post decrement        11-1=10 but display 11
        System.out.println(a);                            //final a=10
        
    }
    
}
