import java.util.*;
class som
{
    public static void main(String args[])
    {
        String s= "its good habit to feed poor no by ishan q ki yhe";
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch==s.charAt(i+1))
            {
                count++;
                System.out.println((char)s.charAt(i)+""+(char)s.charAt(i+1));
            }
        }
        System.out.println("number of character is "+count);
    }
}