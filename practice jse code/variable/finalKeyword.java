public class finalKeyword {
    public static void main(String arg[])
    {
        int a=20;
        a=20;
        final int no=10;
        //no=20;  //generate error because the final keyword do not change value ,the value is unchangeable
        System.out.println(a);  //20
        System.out.println(no);   //10
    } 
    
}
