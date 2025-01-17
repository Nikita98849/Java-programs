public class whileloop {
    public static void main(String []agr)
    {
        int no=0;
        //System.out.println("Even number");
        while(no<=100)
        { if(no%2==0)
            {   System.out.print("Even number :- ");
                System.out.print(no+" ");
                no++;
            }
            if(no%2!=0)
            {   System.out.print("      odd  number :- ");
                System.out.print( ""+no+" ");
                no++;
            }
            System.out.println("");
        }
    
       
    }
    
}
