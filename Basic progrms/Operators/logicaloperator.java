import java.util.Scanner;
public class logicaloperator {
    public static void main(String arg[])
    {
        int a,b;
        System.out.println("Enetr the two numbers ");
        Scanner sc=new Scanner(System.in);
    
        a=sc.nextInt();
        b=sc.nextInt();
    
        System.out.println("Logical AND "+((a>=b) && (a<=b)));
        System.out.println("Logical OR "+((a>=b) || (a<=b)));
        System.out.println("Logical NOT "+!(a>=b));
        System.out.println("Logical AND "+((a<b) && (a<=b)));
        System.out.println("Logical OR "+((a>=b) || (a<=b)));
    
    }
    
}
    

