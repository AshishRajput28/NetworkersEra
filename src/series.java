import java.util.*;
class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                break;
            }
        }
        System.out.println(i);
        System.out.println(s.substring(i+1,s.length()));
    }
}