import java.util.Scanner;

class oddno
{
    public static void main(String arg[])
    {
        int no;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(int i=1;i<=no;i+=2)
        {
            System.out.print(i+" ");
        }
    }
}