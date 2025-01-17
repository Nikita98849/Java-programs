import java.util.Scanner;
public class greatestno {
    public static void main(String arg[])
    {
        int no1,no2;
        System.out.print("Enter the two numbers : ");
        Scanner sc=new Scanner(System.in);
        no1=sc.nextInt();
        no2=sc.nextInt();

        if(no1>no2)
        {
            System.out.println("Number"+ no1 +" is greater");

        }
        else
        {
            System.out.println("Number"+ no2+" is greater");
        }

    }
    
}
