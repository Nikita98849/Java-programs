import java.util.Scanner;
public class palindrome{
    public static void main(String arg[])
    {

          int no,rem,c,sum=0;
          System.out.print("Enter the number : ");
          Scanner sc=new Scanner(System.in);
          no=sc.nextInt();
          c=no;
      while(no>0)
      {
         
           rem=no%10;
           sum=(sum*10)+rem;
           no=no/10;
      }
    if(sum==c)
     {
         System.out.print("Number is palindrome");
     }
     else
     {
         System.out.print("Number is not palindrome");
     }
      
    }
    
}
