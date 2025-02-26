public class splitMethod {
    public static void main(String arg[])
    {
        String str="This.is simple,and strong java programming language";
        String regex="[.\\s\\,]";
        String arr[]=str.split(regex);
        for(String a:arr)
        {
            System.out.print(a);
        }
    }
    
}
