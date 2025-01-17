import java.util.Scanner;
public class Bitwiseoperator {
    public static void main(String Aarg[])
    {
        int a,b;
        System.out.println("Enter the two numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
        System.out.println("Bitwise AND "+(a&b));
        System.out.println("Bitwise OR "+(a|b));
        System.out.println("Bitwise XOR "+(a^b));
        System.out.println("Bitwise Compliment "+(~a));

    }
    
}
