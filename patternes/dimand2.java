public class dimand2 {
    public static void main(String arg[])
    {
        int i,j,k;
        for(i=0;i<=5;i++)
        {
            for(k=5;k>i;k--)
            {
                System.out.print(" ");
            }
            for(j=i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=4;i>=0;i--)
        {
            for(k=5;k>i;k--)
            {
                System.out.print(" ");
            }
            for(j=i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
