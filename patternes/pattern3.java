public class pattern3 {
    public static void main(String arg[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    }
    
}
