import java.util.Scanner;
public class Perfectno{
    public static void main(String arg[])
    {
        int no,sum=0;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                sum = sum+i;

            }

        }
        if(no==sum)
        {
            System.out.print("Number is perfect.");
        }
        else{
            System.out.print("Number is not perfect.");
        }
    }
    
}
