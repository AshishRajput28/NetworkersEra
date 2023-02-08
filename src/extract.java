import java.util.*;
class extract
{
    public static void main(String args[])
    {
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        s1=s1.trim(); s1=s1+' '; int sum=0;
        String word="",newword="";
        int len=0; int count=0;
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
                for(int j=len-1;j>=0;j--)
                {
                    char ch1=word.charAt(j);
                    newword=newword+ch1;
                }
                if(newword.equals(word))
                {
                    count++;
                    System.out.print(newword+" ");
                }
                newword=""; word="";
            }
        }
        System.out.println("total palindrome words are ="+count);
    }
}
