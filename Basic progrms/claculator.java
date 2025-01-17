import java.util.Scanner;
public class claculator {
    public static void main(String arg[])
    {
        int no1,no2,cal,ch;
        System.out.print("Enter the two numbers : ");
        Scanner sc=new Scanner(System.in);
        no1=sc.nextInt();
        no2=sc.nextInt();
       System.out.print("Select Operation :");
       ch=sc.nextInt();

       if(ch==1)
       {
             cal=no1+no2;
             System.out.print("Addition = "+cal);
       }

       else if(ch==2)
       {
           cal=no1-no2;
           System.out.print("Addition = "+cal);
       }

       else if(ch==3)
       {
               cal=no1*no2;
               System.out.print("Addition = "+cal);
       }

       else if(ch==4)
       {
             cal=no1/no2;
             System.out.print("Addition = "+cal);
       }

       else
       {
             cal=no1%no2;
             System.out.print("Addition = "+cal);
       }


    }

    
}
