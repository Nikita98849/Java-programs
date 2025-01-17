import java.util.*;
public class datatype {
    public static void main(String arg[])
    {
        int a;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String value");
        String str=sc.nextLine();

        System.out.println("Enter interger value");
        a=sc.nextInt();

        System.out.println("Enter the character value");
        ch=sc.next().charAt(0);

        sc.close();

       //System.out.println(a+" is of the"+((Object)intData).getClass().getSimpleName());
        //System.out.println(ch+" is of the"+((Object)charData).getClass().getSimpleName());
        System.out.println(str+" is of the "+str.getClass().getSimpleName());
     }
    
}
