import java.util.*;
class xyz
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first word");
        String s1=sc.nextLine();
        System.out.println("enter second word");
        String s2=sc.nextLine();
        int a=s1.length(); int b=s2.length();
        char ch[]=new char[a];
        char ch2[]=new char[b];
        int e=0;
        for(int i=0;i<a;i++)
        {
            char c=s1.charAt(i);
            ch[i]=c;
        }
        for(int i=0;i<b;i++)
        {
            char c=s2.charAt(i);
            ch2[i]=c;
        }
        for(int j=0;j<a;j++)
        {
            char ch3=ch[j];
            for(int k=0;k<b;k++)
            {
                char ch4=ch2[k];
                if(ch3==ch4)
                    e++;
            }
        }
        if(e==a)
            System.out.print(s1+"is anagram of "+s2);
        else
        System.out.print(s1+" is not anagram of "+s2);
    }
}