import java.util.Scanner;
public class Nestedifelse {

     public static void main(String arg[])
     {
        int n1,n2,n3;
        System.out.println("Enter tree numbers");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();

        if(n1>n2)
        {
            if(n2>n3)
            {
                System.out.println(n1+" is Greater");
            }
            else
            {
                System.out.println(n3+" is Greater");
            }
        }
        else
        {
            if(n2>n3)
            {
                System.out.println(n2+" is Greater");
            }
            else
            {
                System.out.println(n3+"  is Greater");
            }
        }
        

     }
    
}
