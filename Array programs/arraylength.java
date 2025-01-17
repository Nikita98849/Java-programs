import java.util.Scanner;
public class arraylength {
    public static void main(String arg[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the array element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(" disply the Array element : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
        System.out.print("\n Length of array : "+arr.length);
  
         
        

    }
    
}
