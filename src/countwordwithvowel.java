import java.util.*;
class countwordwithvowel
{
    public static void  main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sentence");
        String s=sc.nextLine();
        String word="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                word=word+ch;
              else
            {
                if(word.charAt(0)>=65&&word.charAt(0)<=90)
                {
                    char a=word.charAt(0);
                    if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
                        System.out.println(word);
                }
                word="";
            }
        }
    }
}