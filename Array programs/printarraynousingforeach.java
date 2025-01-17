import java.util.Scanner;
public class printarraynousingforeach {
    public static void main(String arg[])
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        size=sc.nextInt();
        System.out.print("Enter array element : ");
        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("print array element :");
        for(int b:arr)
        {
            System.out.print(b+" ");
        }
    }
    
}
