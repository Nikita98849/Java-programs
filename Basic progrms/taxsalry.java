import java.util.Scanner;
public class taxsalry {
    public static void main(String arg[])
    {
        int sal;
        double tax;
        System.out.print("Enter Salary : ");
        Scanner sc=new Scanner(System.in);
        sal=sc.nextInt();

        if(sal<=10000)
        {
            System.out.print("No Tax");

        }
        else if(sal>=10000 && sal<=100000)
        {
            tax=sal*0.10;
            System.out.print("10% Tax "+sal+" "+tax );
        }
        else
        {     tax=sal*0.20;
            System.out.print("20% tax "+sal+" "+tax);
        }

    }
    
}
