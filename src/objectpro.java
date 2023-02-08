import java.util.*;
class objectpro
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner (System.in);
        System.out.println("enter a string");
        String S = Sc.nextLine();
        S.trim();
        S= S+" ";
        int c=0,l=0,l2=0,f=0,g=0;
        String a ="";
        for(int i =0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch==' ')
            {
                a=S.substring(c,i);
                l2=a.length();
                if(l2>l)
                {
                    f=c;
                    g = g+l2;

                }
            }
            l=l2;
            c=g+1;
        }
        System.out.println("word="+S.substring(f,1+g).trim());
        System.out.println("length="+S.substring(f,1+g).trim().length());
    }
}