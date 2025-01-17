import java.util.Scanner;
public class sumofoddeven {
    
    void fun()
        {
            int i,no,sum=0;
            System.out.print("Ente the number :");
            Scanner sc=new Scanner(System.in);
            no=sc.nextInt();
             for(i=0;i<=no;i+=2)
                {
                    sum=sum+i;
                    
                }
                System.out.println(" even number of Sum = "+sum );     
            
        }
    

        void fun1()
        {
             int i,no,sum=0;
             System.out.print("Ente the number :");
             Scanner sc=new Scanner(System.in);
             no=sc.nextInt();
                for(i=1;i<=no;i+=2)
                {
                    sum=sum+i;
                    
                }
                System.out.println(" even number of Sum = "+sum );    
            
        }
    
    public static void main(String arg[])
    {
           sumofoddeven s=new sumofoddeven();
           s.fun();
           s.fun1();
            
        
    }
    
}
