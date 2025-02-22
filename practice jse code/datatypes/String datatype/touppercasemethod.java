public class touppercasemethod {
    public static void main(String arg[])
    {
        String str="Hello World";
        System.out.println(str.toUpperCase());
    System.out.println("All character are small letter format");
    for(char i='a';i<='z';i++)
    {    
        System.out.print(i+" ");
    }
    System.out.println(" \nConvert All character are small to capital letter format");
    for(char i='a';i<='z';i++)
    {    String str1=Character.toString(i);
        System.out.print(str1.toUpperCase()+" ");
    }
     
}
}
