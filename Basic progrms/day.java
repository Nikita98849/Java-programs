import java.util.Scanner;
public class day {
    public static void main(String arg[])
    {
        int code;
        System.out.print("Enter code of day: ");
        Scanner sc=new Scanner(System.in);
        code=sc.nextInt();

        switch(code)
        {
            case 1:
            System.out.print("sunday");
            break;

            case 2:
            System.out.print("Munday");
            break;

            case 3:
            System.out.print("Tueaday");
            break;

            case 4:
            System.out.print("Wednesday");
            break;

            case 5:
            System.out.print("Thurasady");
            break;

            case 6:
            System.out.print("Friday");
            break;

            case 7:
            System.out.print("Saturaday");
            break;

            default:
            System.out.print("Invalide case");
        }

    }
    
}
