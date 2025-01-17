import java.util.Scanner;
import java.util.Arrays;
public class CopyOfMethod {
    public static void main(String arg[])
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array first elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=Arrays.copyOf(a,5);             //CopyOf(array_nm,size);

         System.out.print("\nCopy first array into second array : ");
        for(int i=0;i<a.length;i++)
        {
             System.out.print(b[i]+" ");
        }
    }

    


    
}
