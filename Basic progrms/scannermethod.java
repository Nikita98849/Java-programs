import java.util.Scanner;
import java.util.*;
public class scannermethod {
    public static void main(String arg[])
    {
        int no;
        char ch;
        float no1;
        boolean b;
        String str;
     
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String");
        str=sc.nextLine();

        System.out.println("Enter the integer number");
        no=sc.nextInt();

        System.out.println("Enter the float number");
        no1=sc.nextFloat();

        System.out.println("Enter the character");
        ch=sc.next().charAt(0);

        System.out.println("Enter the boolean value");
        b=sc.nextBoolean();

        System.out.println("Interger = "+no);
        System.out.println("Float = "+no1);
        System.out.println("String = "+str);
        System.out.println("Character = "+ch);
        System.out.println("Character = "+b);
        

    }
    
}
