public class MultiTimeCallMethod 
{
    public static void disp()
    {
        System.out.println("Hello JJMCOE");

    }
    public static void main(String arg[])
    {
           disp();
           disp();
           disp();
           disp();
       System.out.println("By using for loop call multiple methods");
           for(int i=0;i<=10;i++)
           {
              disp();
           }
    }  
    
}
