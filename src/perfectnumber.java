import java.util.*;
class perfectnumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sone=sc.nextLine();
        String stwo=sc.nextLine();
        String s1="";
        for(int i=0;i<stwo.length();i++)
        {
            char ch1=sone.charAt(i);
            char ch2=stwo.charAt(i);
            System.out.print((char)ch1);
            System.out.print((char)ch2);
        }
    }
}