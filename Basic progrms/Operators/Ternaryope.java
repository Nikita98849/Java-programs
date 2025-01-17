import java.util.Scanner;
public class Ternaryope
{
    public static void main(String arg[])
    {
        int no1,no2,no3,max,max1;
        System.out.println("Enter the three number");
        Scanner sc=new Scanner(System.in);
        no1=sc.nextInt();
        no2=sc.nextInt();
        no3=sc.nextInt();

        max=(no1>no2)?no1:no2;
        System.out.println("large no in between two number"+max);
        max1=(no1>no2)?(no1>no3?no1:no3):(no2>no3?no2:no3);
        System.out.println("Large number in between three"+max1);

    }
    
}
