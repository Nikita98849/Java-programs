import java.util.Scanner;
public class grstnoof3no {
    public static void main(String arg[])
    {
        int no1,no2,no3;
        System.out.println("Enter three numbers : ");
        Scanner sc=new Scanner(System.in);
        no1=sc.nextInt();
        no2=sc.nextInt();
        no3=sc.nextInt();

        if(no1>no2)
        {
            if(no1>no3)
            {
                System.out.print(no1 +" is Greater");
            }
            else
            {
                System.out.print(no3 +" is Greater");
            }

        }
        else
        {
            if(no2>no3)
            {
                System.out.print(no2 +" is greater");
            }
            else
            {
                System.out.print(no3 +" is Greater");
            }
        }
    }

    
}
