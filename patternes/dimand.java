public class dimand {
    public static void main(String arg[])
    {
        int i,j,k,count=0;
        for(i=0;i<=5;i++)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                System.out.print("* ");
               

            }
            System.out.print("\n");
        }
        for(i=4;i>=0;i--)
        {
            for(j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                System.out.print("* ");
               

            }
            System.out.print("\n");
        }
        
    }
    
}
