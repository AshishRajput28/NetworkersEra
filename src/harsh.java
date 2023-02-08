import java.util.Scanner;
class harsh
{
    public static void main(String[] arg) // Aanchal is headgirl of sr.
    {
            System.out.println("enter a sentence");
            String s=new Scanner(System.in).nextLine();
            s=s+" ";
            String s1="",minword="";
            int l1=0,minlen=l1;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                {
                    if(ch!=' ')
                    {
                        s1=s1+ch; // harsh arayn sanya = has
                    }
                    else
                    {
                        l1=s1.length();
                        if(l1<minlen)
                        {
                            minlen=l1;
                            minword=s1;
                        }
                        s1="";
                    }
                }
            }
            System.out.println(minword+"  "+minlen);
    }
}