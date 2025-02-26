public class TypeOfVariable {

    int a=20;                       //instance variable
    static int c=30;                 //static variable          
    public static void main(String arg[])
    {
        int a=10;                         //local variable
        final int sum=a+c;                    //final variable
        final int d=50;                        //final variable
        System.out.println(a);                           //10
        TypeOfVariable t=new TypeOfVariable();
        System.out.println(t.a);                         //20
        System.out.println(c);                            //30
        System.out.println(t.c);                        //30
        System.out.println(sum);                           //50
        System.out.println(d);                              //20
        
    }
    
}
