import java.util.*;
class namita_word
{
    public static void main(String args[])
    {
        String s1="BeSingle", s2="Beommitted";
        int count=0,count1=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count++;
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count1++;
            }
        }
        if(count==count1)
        {
            System.out.println("namita word");
        }
        else
        {
            System.out.println("not namita word");
        }
    }
}