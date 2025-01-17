import java.util.Scanner;
public class areaRect {
    public static void main(String arf[])
    {
        int l,b,area;
        System.out.print("Enter length and Breadth : ");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        area=l*b;
        System.out.print("Area of rectangle "+area);
    }
 
    
}
