import java.util.Scanner;
public class ifStatement
 {    
        public static void main(String arg[]) {

        int no1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        no1=sc.nextInt();

        if(no1%2==0)
        {
            System.out.println(no1+" This number is even ");
        
        }
        System.out.println("Thank you");
    }
    
}
