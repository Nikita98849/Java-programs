import java.util.Scanner;
public class addOfTwoMatrix {
    public static void main(String arg[])
    {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first array elements : \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        System.out.print("Enter sencond array elements :\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
            
        }
        System.out.print("\nAddition of two matrix : \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j]=a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
}
