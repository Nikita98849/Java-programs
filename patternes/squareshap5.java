public class squareshap5 {
    public static void main(String arg[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==2 || i==5 || j==2 || j==5)
                {
                    System.out.print("*");

                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
    
}
