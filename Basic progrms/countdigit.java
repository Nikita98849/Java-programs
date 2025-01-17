import java.util.Scanner;
public class countdigit {
    public static void main(String arg[])
    {
        int no,count=0;
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        while(no>0)
        {
            no=no/10;
            count++;
        }
        System.out.print("\n Count : "+count);
    }
    
}
