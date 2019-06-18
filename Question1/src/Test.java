import java.io.FileNotFoundException;

class Test2
{
    void demo() throws FileNotFoundException
    {
        System.out.println("This method will not be called");
    }

}



public class Test extends Test2
{
    void demo() throws FileNotFoundException
    {
           throw new FileNotFoundException();
    }


    public static void main(String args[])
    {
        Test2 t2=new Test();

        try
        {
            t2.demo();
        }
        catch(Exception ex)
        {
            System.out.println("Exception is "+ex+" which is explicitly thrown");
        }

    }



}
