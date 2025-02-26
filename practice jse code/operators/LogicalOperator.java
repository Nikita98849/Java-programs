public class LogicalOperator {
    public static void main(String str[])
    {
        int a=10,b=20;
        System.out.println(a>b && a<b);
        System.out.println(a<b && a>b);
        System.out.println(a>b || a<b);
        System.out.println(a<b || a>b);
        System.out.println(!(a>b));
        System.out.println(!(a<b));
    }
    
}
