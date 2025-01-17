public class ascii1 {
    public  static void main(String arg[])
    {
        for(char i='A';i<='Z';i++)
        {
            int a=i;
            System.out.println(i+ " "+a);
        }
   
         System.out.print("\n");
        for(char i='a';i<='z';i++)
        {
            int a=i;
            System.out.println(i+ " "+a);
        }
        System.out.print("\n");

        for(char i=65;i<=90;i++)
        {
            System.out.print(i+ " ");
        }
        System.out.print("\n");

        for(char i=65;i<=122;i++)
        {
            System.out.print(i+ " ");
        }


        
    }
    
}
