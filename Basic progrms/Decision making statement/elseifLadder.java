import java.util.Scanner;
public class elseifLadder {
    public static void main(String arg[])
    {
        int marks;
        System.out.println("Enter marks");
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();

        if(marks>=75)
        {
            System.out.println("Distinction");
        }
        else if(marks>=60 && marks<75)
        {
            System.out.println("First class");
        }
        else if(marks>=40 && marks<60)
        {
            System.out.println("Secnd class");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
