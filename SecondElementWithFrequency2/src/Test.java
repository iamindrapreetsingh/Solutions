import java.util.*;

public class Test
{
    Scanner s=new Scanner(System.in);
    String str,test;
    int count,pos=1;
    void perform()
    {
        System.out.println("Enter the String");
        str=s.nextLine();

        String letters[]=str.split("");

        LinkedHashSet<String> hs=new LinkedHashSet<>();


        for(String temp:letters)
            hs.add(temp);

        Iterator itr=hs.iterator();

        while(itr.hasNext())
        {
            count=0;
            test=itr.next().toString();

            for(String temp:letters) {
                if (test.equals(temp))
                    count++;
            }
            if(count==2 && pos==2) {
                System.out.println("The required character is "+test);
                break;
            }
            else pos++;
        }




    }

    public static void main(String[] args)
    {
        Test t=new Test();
        t.perform();
    }
}
