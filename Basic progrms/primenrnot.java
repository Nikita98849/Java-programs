import java.util.Scanner;
public class primenrnot {
    public static void main(String arg[])
    {
        int no,count=0;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();

        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                count++;
            }

        }
        if(count==2)
        {
            System.out.print("Number is prime ");

        }
        else
        {
           System.out.print("Number is not prime ");
        }
    }
    
}
