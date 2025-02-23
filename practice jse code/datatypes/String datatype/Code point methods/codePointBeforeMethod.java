public class codePointBeforeMethod {
    public static void main(String arg[])
    {
        String str=" Hello nikita";
       // System.out.println(str.codePointBefore(1));
        for(int i=1;i<str.length();i++)
        {
            System.out.println(str.charAt(i)+"(Before letter Unicode number is) "+str.charAt(i-1)+" = "+str.codePointBefore(i));
        }
    }
    
}
