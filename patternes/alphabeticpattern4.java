public class alphabeticpattern4 {
    public static void main(String arg[])
    {
        char i,j,k,count='A';
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
