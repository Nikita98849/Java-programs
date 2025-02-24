public class stratsWith {
    public static void main(String arg[])
    {
        String str="Hello";
        System.out.println(str.startsWith("h"));       //false
        System.out.println(str.startsWith("hello"));   //false
        System.out.println(str.startsWith("Hello"));    //true
        System.out.println(str.startsWith("H"));        //true
        System.out.println(str.startsWith("llo"));       //false
    }
    
}
