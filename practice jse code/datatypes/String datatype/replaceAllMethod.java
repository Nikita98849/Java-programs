public class replaceAllMethod {
    public static void main(String arg[])
    {
        String str="this is a cat,cats are so beautiful";
         String regex="(?i)cat";
         System.out.println(str.replaceAll(regex,"dog"));
    }
    
}
