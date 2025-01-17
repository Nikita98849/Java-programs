import java.util.Scanner;
import java.util.Arrays;
public class copyarry {
    public static void main(String arg[])
    {
        int size;
        System.out.print("Enter array size :");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int a[]=new int[size];
        int b[]=new int[size];
        int c[][]={{10,20},{30,40}};
        String d[]={"hello","java","programming"};
        

        System.out.print("enter array element : ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("Display Array element : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.print("\nCopy array arr1 into arr2  : ");
        for(int i=0;i<size;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
          
        } 
        System.out.print("\nArray print: "+Arrays.asList(d)); 
        System.out.print("\nArray print: "+Arrays.toString(a)); 
       
        System.out.print("\nArray print: "+Arrays.deepToString(c)); 

    }
    
}
