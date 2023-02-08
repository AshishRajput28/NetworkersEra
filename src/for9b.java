import java.util.*;
class for9b
{
    public static void main(String args[])
    {
       String s="TOP";
       for(int i=0;i<s.length();i++)
       {
           for(int j=s.length()-1;j>=i;j--)
           {
               char ch=s.charAt(j);
               System.out.print(ch+" ");
           }
           System.out.println();
       }
       for(int k=s.length()-1;k>=0;k--)
       {
           for(int l=s.length()-1;l>=k;l--)
           {
               char ch=s.charAt(l);
               System.out.print(ch+" ");
           }
           System.out.println();
       }
    }
}