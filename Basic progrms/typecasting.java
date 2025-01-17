public class typecasting {
    public static void main(String arg[])
    {
        int no=10;
        double no1=no;   //implicit typecasting
        System.out.println("Converting interger number into double "+no1);

        int n=(int)no1;      //explicit typecasting
        System.out.println("Converting double into integer "+n);
    }

    
}
