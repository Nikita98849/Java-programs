import java.util.Scanner;
public class voting {
    public static void main(String arg[])
    {
        int age;
        System.out.print("Enter age :");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.print("\nVoting is eligibility");

        }
        else
        {
            System.out.print("\nVoting is not eligibility");
        }

    }
    
}
