import java.util.*;
class stringsr
{
    public static void main(String args[])
    {
       String a="computer";
       int count=0,first_vowel=0,lastvowel=0;
       System.out.println(a.indexOf('m'));
       System.out.println(a.lastIndexOf('m'));
       for(int i=0;i<a.length();i++)
       {
           char ch=a.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               first_vowel=i;
               break;
           }
       }
       System.out.println(first_vowel);
    }
}
