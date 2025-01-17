import java.util.Scanner;
public class marks {
    public static void main(String arg[])
    {
         int size,sum=0;
         double avg=0.0;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter array size :");
          size=sc.nextInt(); 
        int a[] = new int[size];
        
        System.out.println("\nEnter array element :");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("\n Array Element  ");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
            sum=sum+a[i];
             avg=sum/size;
        }
        
        System.out.print("\n sum : "+sum);
        System.out.print("\nAverage : "+avg);


    }
    
}
