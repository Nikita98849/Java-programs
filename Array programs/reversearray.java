import java.util.Scanner;
public class reversearray {
    public static void main(String arg[])
    {
        int size;
        System.out.print("Enter array size : ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();

        int a[]=new int[size];

        System.out.print("\nEnter array element :");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("\nDisply array element :");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nDisplay reverse array:");

        for(int i=size-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
