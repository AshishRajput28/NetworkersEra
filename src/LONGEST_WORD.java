import java.util.*;
class LONGEST_WORD
{
    public static void main(String args[])
    {
        String word="",maxword=""; int len=0;
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        s1=s1.trim(); s1=s1+' ';
        int maxlen=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch!=' ')
            {
                word=word+ch;
            }
            else
            {
                len=word.length();
                if(len>maxlen)
                {
                    maxlen=len;
                    maxword=word;
                }
                word="";
            }
        }
        System.out.println("longest_word ="+maxword+" " +"maxlen="+maxlen);
    }
}
