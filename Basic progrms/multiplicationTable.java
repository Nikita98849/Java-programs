import java.util.Scanner;
public class multiplicationTable {
    public static void main(String arg[])
    {
        int no,res;

        for(int j=1;j<=20;j++)
        {
            for(int i=1;i<=10;i++)
            {
                 res=j*i;
                System.out.println(res+"");
                
            }
            System.out.print("\n....................\n");
        }
        System.out.print("Enter the number :");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        
       
        System.out.print("\n");
        for(int i=1;i<=10;i++)
        {
             res=no*i;
            
            System.out.println(no+" * "+i+" = "+(no*i));
        }



    }

    
}
