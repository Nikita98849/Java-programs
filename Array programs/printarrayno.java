import java.util.Scanner;
public class printarrayno {
    public static void main(String arg[])
    {    
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        size=sc.nextInt();
        System.out.print("Enter the array element : ");
        int arr[] = new int[size];
       for(int i=0;i<size;i++)
       {
          arr[i]=sc.nextInt();
       }
       System.out.print("Print array element : ");
       for(int i=0;i<size;i++)
       {
         System.out.print(arr[i]+" ");
       }

    }
    
}
