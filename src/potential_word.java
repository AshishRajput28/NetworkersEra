import java.util.*;
class potential_word
{
    public static void main(String args[])
    {
        String word="",maxword="";
        int len=0;
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        s1=s1+' ';
        int maxlen=s1.length(); int sum=0; int max=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch!=' ')
            {
                sum=sum+(int)ch;
                word=word+ch;
            }
            else
            {
                if(sum>max)
                {
                    max=sum;
                    maxword=word;
                }
                word="";
                sum=0;
            }
        }
        System.out.println("maxword="+maxword+" " +"maxlen="+max);
    }
}
