public class ExplicitTypeCasting {
    public static void main(String arg[])
    {
        double d=10.6;
        int i=(int)d;         //double to int
        char c='A';
        String str="hello";
        String str1=Character.toString(c);     //char to string
    
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
        System.out.println(str1);

        char c1[]={'a','s','d','f'};
        String s=" ";
        System.out.println(c1);
        s=s.copyValueOf(c1);
        System.out.println(s);

        char z='A';
        int z1=(int)z;      //char to int
        System.out.println(z);
        System.out.println(z1);
        
    }
    
}
