import java.util.Scanner;
public class charvowel {
    public static void main(String arg[])
    {
        char c;
        System.out.print("Enter the character : ");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);

        if(c=='a' || c=='e' || c=='i' || c=='o' ||  c=='u')
        {
            System.out.println("character is vowel "+ c);
        }
        else
        {
            System.out.println("character is not vowel "+c);
        }

    }
    
}
