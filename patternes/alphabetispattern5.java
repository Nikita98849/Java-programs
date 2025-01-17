public class alphabetispattern5 {
    public static void main(String arg[])
    {
        char i,j,k,count=65;
        for(i='A';i<='E';i++)
        {
            for(j='E';j>i;j--)
            {
                System.out.print(" ");
            }
            for(k='A';k<=i;k++)
            {
                
                System.out.print(count+" ");
                count++;
            }
            System.out.print("\n");
        }
    }
    
}
