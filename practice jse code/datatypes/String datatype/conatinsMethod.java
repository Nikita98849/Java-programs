public class conatinsMethod{
    public static void main(String arg[])
    {
        String str="Hello World";
        System.out.println(str.contains("Hello"));    //true
        System.out.println(str.contains("e"));        //true
        System.out.println(str.contains("Hell"));     //true
        System.out.println(str.contains("He wor"));    //false
        System.out.println(str.contains("HWd"));       //false
    } 
}