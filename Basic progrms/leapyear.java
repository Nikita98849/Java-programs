import java.util.Scanner;
public class leapyear {
    public static void main(String arg[])
    {
        int year;
        System.out.print("Enter year");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();

        if(year%4==0)//if(year%100==0 && year%400==0 || year%100!=0 && year%400==0)
        {
            System.out.print("This is leap year .");
        }
        else
        {
            System.out.print("This is not leap year.");
        }


    }

    
}
