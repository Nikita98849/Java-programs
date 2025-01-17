import java.util.Scanner;
public class samallestNo {
    public static void main(String arg[])
    {
        int arr[]=new int[5];
        System.out.print("Enter array elements : ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.print("smallest elements from an array : "+min);
    }
    
}
