import java.math.BigDecimal;

public class Test
{
    public static void main(String args[])
    {
        BigDecimal bd1=new BigDecimal(20000000);
        BigDecimal bd2=new BigDecimal(50000000);
        int a=bd1.intValue();
        int b=bd2.intValue();
        System.out.println("Sum is-"+(a+b));
    }
}
