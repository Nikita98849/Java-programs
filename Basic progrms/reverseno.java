import java.util.Scanner;
public class reverseno {
    public static void main(String afk[])
    {
        int no,rem;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
          no=sc.nextInt();
        while(no>0)
        {
            rem=no%10;
            System.out.print(rem);
            no=no/10;
        }
    }
    
}
