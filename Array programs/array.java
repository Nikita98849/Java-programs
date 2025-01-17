import java.util.Scanner;
public class array {
    public static void main(String arg[])
    {
         int arr[]=new int[5];
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter array element : ");    //dyanamic array
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Printing array element : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }

        int arr1[]={10,20,30,40,50,60};     //static array
        System.out.print("\nPrint array1 element : ");
          for(int i=0;i<arr1.length;i++)
          {
            System.out.print(arr1[i]+" ");
          }
          System.out.print("\nIndex two element : "+arr1[2]);       //30

          int a[]=new int[5];      //static array
          a[0]=10;
          a[1]=20;
          a[2]=30;
          a[3]=40;
          a[4]=50;
          for(int i=0;i<a.length;i++)
          {
            System.out.print("\n"+a[i]+" ");
          }


        


    }
    
}