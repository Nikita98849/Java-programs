import java.util.Scanner;
public class insertele {
    public static void main(String arg[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        size=sc.nextInt();
         int arr[]=new int[size];
        System.out.print("Enter array elemeents : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter any location :");
        int loc=sc.nextInt();

        System.out.print("Enter new item in an array :");
        int item=sc.nextInt();

        for(int i=size;i>loc;i--)
        {
            arr[i]=arr[i+1];
        }

        arr[loc]=item;
        size++;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    
}
