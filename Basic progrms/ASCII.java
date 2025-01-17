import java.util.Scanner;
public class ASCII {
    public static void main(String arg[])
    {
        char ch;
        System.out.print("Enter the charater : ");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);

        int c=ch;
        System.out.println("ASCII No. : "+c);

    }
    
}
