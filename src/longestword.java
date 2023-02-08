import java.util.*;
class longestword
 {
    public static void main(String args[])
    {
        String word="",minword=""; int len=0;
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        s1=s1.trim(); s1=s1+' ';
        int minlen=s1.length();
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
                if(len<=minlen)
                {
                    minlen=len;
                    minword=word;
                }
                word="";
            }
        }
        System.out.println("smallest_word ="+minword+" " +"minlen="+minlen);
    }
}
