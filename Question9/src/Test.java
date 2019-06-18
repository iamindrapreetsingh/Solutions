import java.util.Scanner;
public class Test
{
    Scanner s=new Scanner(System.in);
    String str;
    int num;
    String strTemp;

    void check()
    {
        System.out.println("Enter the number");
        num=s.nextInt();
        str=num+"";

        for(int i=str.length()-1;i>=0;i--)
        strTemp=strTemp+str.charAt(i);

        if(str.equals(strTemp))
        System.out.println("Number is palindrome");

        else
        System.out.println("Number is not a palindrome");

    }

    public static void main(String[] args)
    {
       new Test().check();
    }
}
