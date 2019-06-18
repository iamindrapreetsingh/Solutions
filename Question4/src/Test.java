public class Test
{
    public static void main(String args[])
    {
        int count=1;
        String str="suszkskkcloowppzpaasllalx";
        String strTemp="";

        for(int i=0;i<str.length();i++)
        {
            count=1;
            if(strTemp.contains(""+str.charAt(i))==false) {
                for (int j = i + 1; j < str.length(); j++)

                    if (str.charAt(j) == str.charAt(i))
                    count++;

                    System.out.println("Occurence of " + str.charAt(i) + " =" + count);
                    strTemp = strTemp + str.charAt(i);
            }
        }

    }
}
