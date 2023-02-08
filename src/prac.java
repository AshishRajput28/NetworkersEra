import java.util.*;
public class prac
{
    public static void  main(String args[])
    {
     String a1="motoe" , a2="popas";
     String s1="",s2="";
     char c1,c2;
     for(int i=0;i<a1.length();i++)
     {
         c1=a1.charAt(i); c2=a2.charAt(i);
         if((c1!='a'&&c1!='e'&&c1!='i'&&c1!='o'&&c1!='u')&&((c2!='a'&&c2!='e'&&c2!='i'&&c2!='o'&&c2!='u')))
         {
             s1=s1+c1; s2+=c2;
         }
         if((c1!='a'&&c1!='e'&&c1!='i'&&c1!='o'&&c1!='u')&&(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u'))
         {
             s1=s1+c2+c1;
         }
         if((c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')&&(c2!='a'&&c2!='e'&&c2!='i'&&c2!='o'&&c2!='u'))
         {
             s2=s2+c2+c1;
         }
         if((c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')&&(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u'))
         {
             s2=s2+c1; s1=s1+c2;
         }
     }
        System.out.println(s1);
        System.out.println(s2);
    }
}
