public class endWithMethod {
    public static void main(String arg[])
    {
        String str="Hello";
        System.out.println(str.endsWith("o"));        //true
        System.out.println(str.endsWith("ello"));     //true
        System.out.println(str.endsWith("alo"));        //false
        System.out.println(str.endsWith("H"));         //false

    }
    
}
