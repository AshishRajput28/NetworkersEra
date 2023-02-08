import java.util.Scanner;
public class encrypt
{
    String wrd,newwrd;
    int len;
    encrypt()
    {
        wrd="";newwrd="";len=0;
    }
    void acceptword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        wrd=sc.nextLine();
        len=wrd.length();
        wrd=wrd.toUpperCase();
    }
    void frevowcon()
    {
        int count=0;
        for(int i=0;i<len;i++)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                count++;
            }
        }
        System.out.println("number of vowel "+count);
    }
    void nextvowel()
    {
        for(int i=0;i<len;i++)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                switch (ch)
                {
                    case 'A': newwrd = newwrd + 'E'; break;
                    case 'E': newwrd = newwrd + 'I'; break;
                    case 'I': newwrd = newwrd + 'O'; break;
                    case 'O': newwrd = newwrd + 'U'; break;
                    case 'U': newwrd = newwrd + 'A'; break;
                    default: break;
                }
            }
                else
                    newwrd=newwrd+ch;
            }
        }
        void display()
        {
            System.out.println(wrd+" "+newwrd);
        }
    public static void main(String  args[])
    {
        encrypt obj=new encrypt();
        obj.acceptword();
        obj.frevowcon();
        obj.nextvowel();
        obj.display();
    }
}
