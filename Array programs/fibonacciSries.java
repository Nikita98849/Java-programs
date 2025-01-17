import java.util.Scanner;
public class fibonacciSries {
    public static void main(String arg[])
    {
        int a=0,b=1,c,term;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter term : ");
        term=sc.nextInt();

        for(int i=1;i<=term;i++)
        {
            System.out.print(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
    
}
