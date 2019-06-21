import java.sql.SQLOutput;
import java.util.*;

class Test
{
    Scanner s=new Scanner(System.in);
    int count=1;

    void perform()
    {
        System.out.println("Enter the string");
        String str=s.nextLine();
        String words[]=str.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();

            for(String temp:words)
            {
                if(hm.containsKey(temp))
                {
                    count=hm.get(temp);
                    hm.put(temp,count+1);
                }
                else
                {
                    hm.put(temp,count);
                }

            }

        for (HashMap.Entry<String,Integer> entry : hm.entrySet())
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }



    }
    public static void main(String[] args)
    {
        Test t=new Test();
        t.perform();
    }
}
