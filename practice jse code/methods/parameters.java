public class parameters {
    int a,b;
    public void disp(int a,int b)
    {
        this.a=a;
        this.b=b;
        int sum=a+b;
        System.out.println("Sum = "+sum);
    }
    public static void main(String arg[])
    {
        parameters p=new parameters();
        p.disp(10,20);
    }
    
}
