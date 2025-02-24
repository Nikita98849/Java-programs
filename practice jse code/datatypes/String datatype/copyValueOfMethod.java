public class copyValueOfMethod {
    public static void main(String arg[])
    {
        char ch[]={'0','1','2','3','4','5','6'};

        String str="";
        str=str.copyValueOf(ch,0,7);       //01234567
        System.out.println(str);
    }
    
}
