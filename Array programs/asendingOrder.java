import java.util.Scanner;
public class asendingOrder {
    public static void main(String arg[])
    {
        int size,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");      //size
        size=sc.nextInt();

        int arr[]=new int[size];
        System.out.print("Enter the array elements :");    //elements
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();            //input
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                }
                 
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
    }

    
}
