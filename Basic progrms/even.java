import java.util.Scanner;
class even
{
    public static void main(String arg[])
    {
        System.out.println("hello world");
        int no;
        System.out.print("enter no.");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        if(no%2==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
}