import java.util.Scanner;
public class tribonacciseries {
    public static void main(String arg[])
    {
        int a=0,b=1,c=2,d,term;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter term : ");
         term=sc.nextInt();

         for(int i=1;i<term;i++)
         {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
         }
    }
    
}
