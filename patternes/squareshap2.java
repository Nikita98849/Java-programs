public class squareshap2 {
    public static void main(String arg[])
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++)
            {
                if(i==1 || i==3 || j==1 || j==3)
                    System.out.print("*");
                
                else
                   System.out.print(" ");
                
            }
            System.out.print("\n");
        }
    }
    
}
