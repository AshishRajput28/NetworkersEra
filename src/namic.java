import java.util.*;
class namic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String  s=sc.nextLine();
        int low=0,up=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isLowerCase(ch))
                    low++;
                else
                    up++;
            }
        }
        if(low==up)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}