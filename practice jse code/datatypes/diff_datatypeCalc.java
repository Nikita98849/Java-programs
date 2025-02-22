public class diff_datatypeCalc {
    public static void main(String arg[])
    {
        int a=10;
        float f=10.6f;
        float f1=10.4f+f;
        char c='$';
        String str="hello";
        System.out.println("A = "+a);        //10
        System.out.println("F = "+f);         //10.6
        System.out.println("F1 = "+f1);       //21.0
        System.out.println("C = "+c);         //$
        System.out.println(" "+f1+c);         // 21.0$
        System.out.println(f1+c);             // '$' ascii code is 36 that is, f1=21.0 and c=36,  21.0+36=57.0         //57.0
        System.out.println(a+c);               // a=10 and '$' ascii code is 36 therefore      10+36=46               //46
        System.out.println(f+a);                 //10.6+10=20.6
        int c1=(int)c;                          //convert char to int datatype '$'=36
        System.out.println(c1);                  //36
        System.out.println(c+str);                //$hello
        System.out.println(a+str);               //10hello
        System.out.println(f+str);               //10.6hello  
    }
    
}
