public class nnewfunction {
    
    void fun()
    {
        System.out.println("new function is created in class and outside the main() method");

    }

    public static void main(String arg[])
    {
        nnewfunction obj=new nnewfunction();
        obj.fun();
        System.out.println("this is inside the main() method ");
}
    }
    
