import java.util.*;
class boring
{
    public static void main(String args[])
    {
        System.out.println("enter a word");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String vow="",con=""; int i;
        s=s.toLowerCase();
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                break;
            }
        }
        for(int k=i;k<s.length();k++)
        {
            char ch1=s.charAt(k);
            if(ch1!='a'&&ch1!='e'&&ch1!='i'&&ch1!='o'&&ch1!='u')
            {
                con+=ch1;
            }
            else
            {
                vow+=ch1;
            }
        }
        System.out.println(con+s.substring(0,i)+vow);
    }
}