public class pattern6 {
    public static void main(String arg[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
                {
                    System.out.print("*");
                }
            
            System.out.print("\n");
        }
    }
    
}
