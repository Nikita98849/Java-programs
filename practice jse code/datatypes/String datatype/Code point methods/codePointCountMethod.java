public class codePointCountMethod {
    public static void main(String arg[])
    {
          String str="Hello World";
          System.out.println(str.codePointCount(2,8));    //6
          System.out.println(str.codePointCount(0,str.length()));    //11
    }
    
}
