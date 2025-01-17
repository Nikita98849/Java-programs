import java.util.Scanner;
public class allprime
{
    public static void main(String arg[])
    {
        int no;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(int j=1;j<=no;j++)
        {
            int count=0;
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                 {
                    count++;
                 }
            

            }
            if(count==2)
            {
                System.out.print(j+" ");
            }
        }

    }
}