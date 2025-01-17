import java.util.Scanner;
public class deleteele {
    public static void main(String arg[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size :");
        size=sc.nextInt();
   
        int a[]=new int[size];
         System.out.print("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter any loaction : ");
        int loc=sc.nextInt();

        for(int i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;

        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
