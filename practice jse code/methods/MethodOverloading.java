public class MethodOverloading {
    static int disp(int a,int b)
    {
        return a+b;
    }
    static int disp(int a,int b,int c)
    {
        return a+b+c;
    }
    static int disp(float f)
    {
        return f;

    }
    public static void main(String arg[])
    {
        System.out.println(disp(40,50));          //90
        System.out.println(disp(10,80,90));     //180
        System.out.println(10);                     //10
    }



    
}
