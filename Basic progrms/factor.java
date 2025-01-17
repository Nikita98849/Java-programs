import java.util.Scanner;
public class factor {
    public static void main(String arg[])
    {
        int no;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);

        no=sc.nextInt();

        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
