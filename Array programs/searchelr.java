import java.util.Scanner;
public class searchelr {
    public static void main(String arg[])
    {
        int size,n,count=0;
        System.out.print("Enter array size : ");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("\nEnter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("\nDisplay array elements : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("Enter search elements : ");
        n=sc.nextInt();

        for(int i=0;i<size;i++)
        {
            if(n==arr[i])
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.print("item found "+count+" elements ");
        }
        else
        {
            System.out.print("item is not found"+count+"elements ");
        }

    }    
}
