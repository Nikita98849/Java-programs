import java.util.Math;
import java.util.Scanner;
public class areaTriangle { 
    public static void main(String arg[])
    {
        int a,b,c;
        double area,sp;
        System.out.print("Enter the sides of triangle : ");
        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.print("Area of Trangle : "+area);
    }
    
}
