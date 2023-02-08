import java.util.*;
class methodc9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        String s=sc.nextLine(); String wrd=""; String maxwrd="";
        s=s.trim(); s=s+' '; int count=0; int countmax=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                wrd=wrd+ch;
            }
            else
            {
                for(int j=0;j<wrd.length();j++)
                {
                    char ch1=wrd.charAt(j);
                    if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
                    {
                        count++;
                    }
                }
                if(count>countmax)
                {
                    countmax = count;
                    maxwrd=wrd;
                }
                count=0;
                wrd="";
            }
        }
         System.out.println(maxwrd+" "+countmax);
    }
}