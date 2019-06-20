import java.sql.SQLOutput;
import java.util.*;

class Test
{
    Scanner s=new Scanner(System.in);
    int count=1;
    String temp;

    void perform()
    {
        System.out.println("Enter the string");
        String str=s.nextLine();
        String words[]=str.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        HashSet<String> hs=new HashSet<>();

        for(String temp:words)
            hs.add(temp);


        Iterator<String> itr=hs.iterator();

        while(itr.hasNext())
        {
            temp=itr.next();
            count=0;
            for(String temp2:words)
            {
                if(temp.equals(temp2))
                    hm.put(temp2,++count);


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
