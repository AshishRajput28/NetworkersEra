import java.util.*;
class practice1
{
    public static void main(String args[])
    {
        String s="today is not sunday";
        String str=""; int len1=0;
        int len=s.length();
        char b[]=new char[len];
        for(int i=0;i<len;i++)
            b[i]=s.charAt(i);
        char t;
            for(int j=0;j<len-1;j++)
            {
                for(int k=0;k<len-1-j;k++)
                {
                    if(b[k]>b[k+1])
                    {
                        t=b[k];
                        b[k]=b[k+1];
                        b[k+1]=t;
                    }
                }
            }
        for(int i=0;i<len;i++)
        {
            System.out.println(b[i]);
        }
        for(int p=0;p<s.length();p++)
        {
            char c=s.charAt(p);
            if(c!=' ')
                str=str+c;
            else
            {
                len1=str.length();
                for(int i=0;i<len1;i++)
                {
                    System.out.print(b[i]);
                }
                System.out.println(" ");
            }
            str=" ";
            len1=0;
        }
    }
}