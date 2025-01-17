import java.util.Scanner;
public class biggestNumber {
    public static void main(String arg[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print("\nBiggest number from an array : "+max);
    }
    
}
