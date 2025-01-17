import java.util.Scanner;

public class Arithmetic_operators {
    public static void main(String arg[])
    {
        int no1,no2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        no1=sc.nextInt();
        System.out.print("Enter the number2:");
        no2=sc.nextInt();
        System.out.println("Additon of two numbers:"+(no1+no2));
        System.out.println("Subtraction of two numbers:"+(no1-no2));
        System.out.println("Multiplication of two numbers:"+(no1*no2));
        System.out.println("Division of numbers:"+(no1/no2));
        System.out.println("Modulus :"+(no1%no2));

    }
    
}
