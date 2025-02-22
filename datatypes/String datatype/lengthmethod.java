public class lengthmethod
{
    public static void main(String arg[])
    {
          String str=new String("hello World");
          String str1=str;
          int length=0;
          System.out.println("Total length of String is : "+str.length());
          System.out.println("to find length of the string by using length() method");
          for(int i=0;i<str.length();i++)
          {
            
            char ch=str.charAt(i);
            System.out.print(ch);
            
          }
          System.out.println();
          System.out.println("to find length of the string without using length() method");
          for(int i=0;i<str.length();i++)
          {
            length++;
            
          }
          System.out.println(length);
          char ch[]=str.toCharArray();
          System.out.println("Display a string : "+ch);  
         
    }

}