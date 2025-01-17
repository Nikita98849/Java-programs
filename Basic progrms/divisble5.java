import java.util.Scanner;
public class divisble5 {
    public static void main(String arg[])
    {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        no=sc.nextInt();

        if(no%5==0)
        {
            System.out.print("Number is divisle.");
        }
        else
        {
            System.out.print("Number is not divisble");
        }
    }
   
    
}
