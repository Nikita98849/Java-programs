public class tolowercasemethod {
    public static void main(String arg[])
    {
        String str="HELLO WORLD";
        System.out.println(str.toLowerCase());
    System.out.println("All character are Capital letter format");
    for(char i='A';i<='Z';i++)
    {    
        System.out.print(i+" ");
    }
    System.out.println(" \nConvert All character are capital to small letter format");
    for(char i='a';i<='z';i++)
    {    String str1=Character.toString(i);
        System.out.print(str1.toLowerCase()+" ");
    }
    
}
}
