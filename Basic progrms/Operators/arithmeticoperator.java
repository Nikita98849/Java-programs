import java.util.Scanner;
public class arithmeticoperator {
    public static void main(String arg[])
    {
        int no1,no2;
        System.out.println("Enter the two number : ");
        Scanner sc=new Scanner(System.in);
        no1=sc.nextInt();
        no2=sc.nextInt();

        System.out.println("Addition = "+(no1+no2));
        System.out.println("Subtraction = "+(no1-no2));
        System.out.println("Multiplication = "+(no1*no2));
        System.out.println("Division = "+(no1/no2));
        System.out.println("Modulas = "+no1%no2);

    }
    
}
