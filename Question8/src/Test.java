enum Demo{one,two,three,four}

public class Test
{
    public static void main(String[] args)
    {
        Demo d;
        d=Demo.one;

        switch(d)
        {
            case one: System.out.println("This is case1");
                    break;

            case two: System.out.println("This is case2");
                    break;

            case three: System.out.println("This is case3");
                    break;

            case four: System.out.println("This is case4");
                    break;

            default:
        }
    }


}
