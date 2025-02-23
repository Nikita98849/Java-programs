public class compareToMethod {
    public static void main(String arg[])
    {
        String str1="hello";                                 //compareTo() method depends on unicode value not a character
        String str2="hello";
        String str4="hEllo";
        String str3="Hello";
        System.out.println(str1.compareTo(str2));      //equal output=0
        System.out.println(str1.compareTo(str3));       //not equal,   h=104,H=72,  104-72=32,   h>H(+ve output)  //32
        System.out.println(str3.compareTo(str2));       //not equal,   h=104,H=72,  104-72=32,   H<h(-ve output)  //-32
        System.out.println(str1.compareTo(str4));       //not equal beacause first character are eual but 2nd character are not equal   //32
    }
    
}
