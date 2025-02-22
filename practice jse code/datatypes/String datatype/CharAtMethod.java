public class CharAtMethod {
    public static void main(String arg[])
    {
        String str="Hello World";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            System.out.println(i+"= "+str.charAt(i));
        }
        System.out.println(str.charAt(7));
       int length=str.length();
        System.out.println(str.charAt(length-5));

        String s="hello hello hello";
        System.out.println("total count of e");
        for(int i=0;i<s.length();i++)
        {
            if('l'==s.charAt(i))
            {
                count++;
            }
            
        }
        System.out.println(count);           //6
    }
    
}
