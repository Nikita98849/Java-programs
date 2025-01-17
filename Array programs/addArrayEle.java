import java.util.Scanner;
public class addArrayEle {
    public static void main(String arg[])
    {
        int size,sum=0;
        System.out.print("Enter the size : ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("\nDisply the array element : ");
        for(int i=0;i<size;i++)
        {
             System.out.print(arr[i]+" ");   
              sum=sum+arr[i];
        }
        System.out.print("\nSum : "+sum);
    }
    
}
