public class simple {
     void disp()
    {
        System.out.println("Creating a class object ");
    }
    public static void disp1()
    {
        System.out.println("Without creating a class object ");
    }
    public static void main(String arg[])
    {
        simple s=new simple();
        s.disp();
        disp1();
    }
    
}
