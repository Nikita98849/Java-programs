import java.util.Scanner;
public class sumofdigit {
    public static void main(String arf[])
    {
        int no,sum=0,rem;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        while(no>0)
        {
            rem=no%10;
            sum=sum+rem;
            no=no/10;

        }
        System.out.print("Sum of digits :"+sum);
    }

    
}
