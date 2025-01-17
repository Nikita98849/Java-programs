public class pattern4 {
    public static void main(String arg[])
    {
        int i,k,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=5;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
