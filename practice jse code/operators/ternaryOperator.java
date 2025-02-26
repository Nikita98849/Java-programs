public class ternaryOperator {
    public static void main(String arg[])
    {
        int no1=200,no2=100,no3=50;
        System.out.println((no1>no2)?"No1 is greater":"No2 is greater");
        System.out.println((no1>no2)?((no1>no3)?"no1 is greater":"no3 is greater"):(no2>no3)?"no2 is graeter":"no3 is greater");
    }
    
}
