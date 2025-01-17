import java.util.Scanner;
import java.util.Arrays;
public class equalMethod {
    public static void main(String arg[])
    {
        int a[]=new int[5];
        int b[]=new int[5];

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first elements : ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter second elements : ");
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }

     Boolean b1=Arrays.equals(a,b);
     System.out.print("two arrays equals or not : "+b1);
    
}
}
