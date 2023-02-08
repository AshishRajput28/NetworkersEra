import java.util.*;
class star
{
    public static void main(String args[])
    {
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); String consonant="",vowel=""; int k;
        for( k=0;k<s.length();k++)
        {
            char ch1=s.charAt(k);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
            {
                break;
            }
        }
        System.out.println("value of k is="+k);
        for(int i=k;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
            {
                consonant+=ch;
            }
            else
            {
                vowel+=ch;
            }
        }
        System.out.println(consonant+s.substring(0,k)+vowel);
    }
}