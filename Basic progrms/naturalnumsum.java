import java.util.Scanner;
public class naturalnumsum {
    public static void main(String arg[])
    {
        int no,sum=0;
        System.out.print("enter no: ");
        Scanner xc= new Scanner(System.in);
         no=xc.nextInt();
         for(int i=0;i<=no;i++)
         {
            sum=sum+i;
            
         }
         System.out.println("sum "+sum);
    }
    
}
