import java.util.*;
class dp_char
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String  n=sc.nextLine();
        char cp='A'; int max=0,count=0; String maxs="", st=""; char ct=' ';
        n=n.trim(); n=n+" ";
        while (cp<='Z')
        {
            for(int i=0;i<n.length();i++)
            {
                char ch=n.charAt(i);
                if(ch==' ')
                {
                    if(count>max)
                    {
                        maxs=st; max=count; ct=cp;
                    }
                    st=""; count=0;
                }
                else
                {
                    if(cp==ch)
                    {
                        count++;
                    }
                    st=st+ch;
                }
            }
            cp++;
        }
        System.out.println("max char is "+ ct+ " count = "+max +" word is "+maxs);
    }
}