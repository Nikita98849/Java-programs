import java.util.Scanner;
public class evenno {
    public static void main(String arg[])
    {
        int no,i;
        System.out.print("Enter the number :");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(i=2;i<=no;i+=2)
        {
            System.out.print(i+" ");
        }

    }
    
}
