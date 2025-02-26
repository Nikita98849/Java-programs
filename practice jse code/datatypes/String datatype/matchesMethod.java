public class matchesMethod {
    public static void main(Stroing arg[])
    {
        String str="nikita|Aaru|praju|";
        System.out.println("Aaru".matches(str));
        System.out.println("AAru".matches(str));
        System.out.println("Nikita".matches(str));
        System.out.println(" ".matches(str));
    }
    
}
