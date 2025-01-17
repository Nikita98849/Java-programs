import java.util.Scanner;
public class twoDarray {
    public static void main(String arg[])
    {
        int a[][]=new int[2][2];
        System.out.print("Enter array elements : ");
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Array matrix :\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
}
