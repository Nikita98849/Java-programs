public class without3variableswap {
    public static void main(String arg[])
    {
        int a=10,b=20;                   //a=(a+b)=(10+20)=30
        System.out.print("\nBefore swapping");
        System.out.print("\nA = "+a+" "+"B = "+b);
        System.out.print("\nAfter swapping");

         a=a+b;  //30
         b=a-b;  //10
         a=a-b;  //20
         System.out.print("\nA = "+a+" "+"B = "+b);

    }
    
}
