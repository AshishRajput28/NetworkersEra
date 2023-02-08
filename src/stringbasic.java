import java.util.*;
class stringbasic
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name");
      String s=sc.nextLine();
      int maxlength=s.length(),length=0;
      s=s+" ";
      String s1="",maxword="";
      for(int i=0;i<s.length();i++)
      {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                s1=s1+ch;
            }
            else
            {
                length=s1.length();
                if(length<maxlength)
                {
                    maxlength=length;
                    maxword=s1;
                }
                s1="";
            }
      }
      System.out.println(maxword+" "+maxlength);
    }
}