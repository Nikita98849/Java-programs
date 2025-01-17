public class staticvariable {

    static int a=10;
    void show()
    {
           int b=10;
           System.out.println("Pre increment "+a+" "+b);
           ++a;
           ++b;
           
    }
    void show1()
    {
        System.out.println("post increment "+a+" "+b);
        a++;
        b++;
    }
    public static void main(String arg[])
    {
        staticvariable s=new staticvariable();
        staticvariable s1=new staticvariable();
        
        s.show();
        s.show();
        s1.show();
        s1.show();
    
    }
    
}
