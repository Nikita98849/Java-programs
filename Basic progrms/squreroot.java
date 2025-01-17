import java.util.Scanner;
import java.util.Math;
public class squreroot {
    public static void main(String arg[])
    {
        int no;
        double m;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        m=Math.sqrt(no);
        System.out.print("Square root of number : "+m);
    }
    
}
