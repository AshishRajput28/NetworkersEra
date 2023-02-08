import java.util.*;
class sunday
{
    public static void main(String args[])
    {
        String st="an oranges and apple";
        String s1=""; int length=0;
        String an="an", and="and";
        int count=0;
        for(int i=0;i<st.length();i++)
        {
            char x=st.charAt(i);
            if(x!=' ')
                s1=s1+x;
            else
            {
                length=s1.length();
                if(s1.equals(an)||s1.equals(and))
                {
                    count++;
                }
                s1="";
            }
        }
       System.out.println(count);
    }
}
