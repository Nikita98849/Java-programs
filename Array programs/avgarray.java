import java.util.Scanner;
public class avgarray {
    public static void main(String arg[])
    {
        int size,sum=0;
        float avg=0;
        System.out.print("Enter array size :");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
         int arr[]=new int[size];
        System.out.print("\nEnter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("\nDisplays array elements : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
            avg=sum/size;
        }
        System.out.print("\n Sum : "+sum);
        System.out.print("\n average : "+avg);

    }
    
}
