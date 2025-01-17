import java.util.Scanner;
public class powerofno1 {
    public static void main(String arg[])
    {
        int no,p,res=1;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        System.out.print("enter the power : ");
        p=sc.nextInt();

       for(int i=1;i<=p;i++)
       {
           res=no*res;
       }

       System.out.println(res);

    }
    
}
