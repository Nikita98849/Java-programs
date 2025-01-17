import java.util.Scanner;
import java.util.*;
public class charLowUpperCase {
    public static void main(String arg[])
    {
        char ch,ch2;
        System.out.print("Enter any Charcter  ");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);

        if(ch>='A' && ch<='Y')
        {
            ch2=Character.toLowerCase(ch);
            System.out.print("To lower case : "+ch2);

        }
        else
        {
            ch2=Character.toUpperCase(ch);
            System.out.print("To Upper case : "+ch2);

        }
       

    }

    
}
