import java.util.Scanner;
public class postnega {
    public static void main(String arg[])
    {
        int no;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();

        if(no>0)
        {
            System.out.print("Number is positive");
        }
        else if(no<0)
        {
            System.out.print("Number is negative.");
        }
        else
        {
            System.out.print("Numner is zero");
        }
    }

    
}
