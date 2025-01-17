public class alphabeticpattern3 {
    public static void main(String arg[])
    {
         char i,j,count=64;
         for(i='A';i<='E';i++)
         {
            for(j='A';j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
                
            }
            System.out.print("\n");
         }
    }
    
}
