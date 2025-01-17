import java.util.Scanner;
public class armstrongno {
    public static void main(String arg[])
    {
        int no,rem,c,sum=0;
        System.out.print("Enter the number : ");    //153
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        c=no;

        while(no>0)
        { 
            rem=no%10;           //rem=153%10=3   rem=15%10=5     rem 1%10=1
            sum=(rem*rem*rem)+sum;  //sum=27+0=27;  sum=125+27=152    sum=1+152=153
            no=no/10;       //1      

        }
        if(c==sum)
        {
            System.out.print("Number is palindrome");
        }
        else
        {
            System.out.print("Number is not palindrome ");
        }
    }
    
}
