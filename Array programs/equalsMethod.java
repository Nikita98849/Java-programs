import java.util.Arrays;
public class equalsMethod {
    public static void main(String arg[])
    {
        int a[]={10,30,403,405,54,45};
        int b[]={10,30,403,405,54,45};

        if(Arrays.equals(a,b))                            
        {
            System.out.print("Two arrays are equal ");     
        }
        else
        {
            System.out.print("Two arrays are not equal ");
        }
    }
    
}
