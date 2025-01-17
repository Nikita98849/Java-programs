import java.util.Scanner;
public class powerofno {
    public static void main(String arg[])
    {
        int no;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();

        int pow=no*no;
        System.out.println("power : "+pow);

    }
    
}
