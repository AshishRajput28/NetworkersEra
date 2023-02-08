import java.util.*;
class rd
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter word");
       String vowel="",consonant="";
       String s=sc.nextLine(); s=s.trim();
       s=s.toLowerCase(); int i;
       for(i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               break;
           }
       }
       for(int j=i;j<s.length();j++)
       {
           char ch=s.charAt(j);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               vowel=vowel+ch;
           }
           else
           {
               consonant=consonant+ch;
           }
       }
       System.out.println(consonant+s.substring(0,i)+vowel);
    }
}