import java.util.*;
class sparsh
{
    public static void main(String args[])
    {
       String s="Today is Friday";
       String s1="",s2="";
       int len=s.length();
       for(int i=0;i<len;i++)
       {
           char ch=s.charAt(i);
           if(ch!=' ')
           {
               s1=s1+ch;
           }
           else
           {
               if(s1.charAt(0)>=65&&s1.charAt(0)<=90)
               {
                   s2=s2+s1+" ";
                   s1=" ";
               }
           }
       }
       System.out.println(s2);
    }
}

