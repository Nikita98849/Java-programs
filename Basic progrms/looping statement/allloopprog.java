public class dowhile {
    
     void disp()
     {  
        int i=0;
        while(i<=10)
        {
            System.out.print(i+" ");
            i++;
        }
        System.out.print("\n");
     }
     void disp1()
     {  
        int i;
        for(i=0;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.print("\n");
     }

     void disp2()
     {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        for(int arr1:arr)
        {
            System.out.print(arr1 +" ");
        }
        System.out.print("\n");
     }
     
     void disp3()
     {
        int i,j;
        for(i=0;i<=10;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
     }

    public static void main(String arg[])
    {   
         dowhile d=new dowhile();
        d.disp();
        d.disp1();
        d.disp2();
        d.disp3();
        int i=0;
     do
     {
          System.out.print(i+" ");
          i++;
     }
     while(i<=10);
     
    }
    
}
