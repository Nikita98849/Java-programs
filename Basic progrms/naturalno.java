import java.util.Scanner;
public class naturalno {
    public static void main(String arg[])
    {
        int no;
        System.out.println("ENter no.");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        for(int i=0;i<=no;i++)
        {
            System.out.print(i+" ");
        }
    }
    
}
