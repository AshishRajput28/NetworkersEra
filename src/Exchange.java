import java.util.*;
class Exchange
{
    String sent,rev;
    int size;
    Exchange()
    {
        sent=""; rev=""; size=0;
    }
    void readsentence()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence ");
        sent=sc.nextLine();
        size=sent.length();
        System.out.println(size);
    }
    void exfirstlast()
    {
        int p=0; char ch; String b;
        for(int i=0;i<size;i++)
        {
            ch=sent.charAt(i);
            if(ch==' '||ch == '.')
            {
                b=sent.substring(p,i);
                if(b.length()!=1)
                {
                    rev+=b.charAt(b.length()-1);
                    rev=rev+b.substring(i,b.length()-1);
                    rev+=b.charAt(0);
                }
                else
                    rev=rev+b;
                rev=rev+" ";
                p=i+1;
            }
        }
    }
    void display()
    {
        System.out.println("Input: " + sent);
        System.out.println("Output:" + rev);
    }
    public static void main(String args[])
    {
        Exchange obj = new Exchange();
        obj.readsentence();
        obj.exfirstlast();
        obj.display();
    }
}