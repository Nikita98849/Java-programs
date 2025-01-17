import java.util.Scanner;
public class areaSqaure {
    public static void main(String arg[])
    {
        int side,area;
        System.out.print("Enter side of square : ");
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();
        area=side*side;
        System.out.print("Ares of Square"+area);
    }
   
    
}
