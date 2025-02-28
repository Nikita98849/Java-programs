public class returnValue {
    static int disp(int a,int b)
    {
        int sum=a+b;
        return sum+10;

    }
    public static void main(String arg[])
    {
        int res=disp(20,30);
        System.out.println(res);
    }
}
