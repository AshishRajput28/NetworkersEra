import java.util.*;

import static java.lang.Long.sum;

class vowelindex
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word");
        String s=sc.nextLine(); int i,j; int a=0,b=0;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                a=s.indexOf(ch);
                break;
            }
        }
        for(j=s.length()-1;j>=0;j--)
        {
            char ch=s.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                b=s.lastIndexOf(ch);
                break;
            }
        }
        System.out.println(s.substring(a+1,b));
    }
}