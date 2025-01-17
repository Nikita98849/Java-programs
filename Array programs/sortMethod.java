import java.util.Arrays; 
import java.util.Scanner;
public class sortMethod {
    public static void main(String arg[])
    {
        int arr[]=new int[5];
        System.out.print("Enter array elements : ");       //by default asending order  
        Scanner sc=new Scanner(System.in);
    
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Disply array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
