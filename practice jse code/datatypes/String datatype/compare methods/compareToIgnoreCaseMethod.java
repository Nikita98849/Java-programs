public class compareToIgnoreCaseMethod {
    public static void main(String arg[])           //this method depends on unicode value
    {
        String str1="hello";                                 //compareTo() method depends on unicode value not a character
        String str2="hello";
        String str4="hi";
        String str3="Hello";
        System.out.println(str1.compareToIgnoreCase(str2));      //equal output=0
        System.out.println(str1.compareToIgnoreCase(str3));       //equal output=0 beacuse this method ignoring uppercase and lower case letter 
        System.out.println(str3.compareToIgnoreCase(str2));       // equal ouptut=0
        System.out.println(str1.compareToIgnoreCase(str4));       //not equal because two strings are different, first letter are equal but 2nd letter are not equal 
    }
    
}
