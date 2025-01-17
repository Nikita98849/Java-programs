import java.util.Scanner;
public class factorial {
    public static void main(String arg[])
    {
        int no,fact=1;
        System.out.print("Enter the numbers :");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.print("\n fibocaii number of "+no+" this number :"+fact);
    }

    
}
