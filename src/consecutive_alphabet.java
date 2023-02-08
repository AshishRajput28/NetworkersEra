import java.util.*;
class consecutive_alphabet
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ");
        String s=sc.nextLine(); int count=0;
        s=s.trim(); s=s+' ';
        for(int i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            int v=(int)ch+1;
            if(s.charAt(i+1)==(char)v)
            {
                System.out.println(ch+""+(char)v);
                count++;
            }
        }
        System.out.println(count);
    }
}