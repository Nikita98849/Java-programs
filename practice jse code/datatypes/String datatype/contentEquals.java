public class contentEquals {
    public static void main(String arg[])
    {
        String str="Hello World";
        System.out.println(str.contentEquals("Hello"));   //false
        System.out.println(str.contentEquals("H"));        //false
        System.out.println(str.contentEquals("Hell"));       //false
        System.out.println(str.contentEquals("Hello World"));    //true
    }
    
}
