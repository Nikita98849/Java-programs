import java.util.Scanner;
public class switchstatement {
    public static void main(String arg[])
    {
        int a=10,b=20,ch;
        System.out.println("Enter the choice" );
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                 System.out.println("Addition of two numbers "+(a+b));
                 break;
            
            case 2:
                 System.out.println("Subtraction of two numbers "+(a-b));
                 break;

            case 3:
                 System.out.println("Multiplication  of two numbers "+(a*b));
                 break;

            case 4:
                 System.out.println("Division of two numbers "+(a/b));
                 break;

            case 5:
                 System.out.println("Modulas of two numbers "+(a%b));
                 break;

            default:
                 System.out.println("Enter correct choice");
             

        }
    }
   
}
