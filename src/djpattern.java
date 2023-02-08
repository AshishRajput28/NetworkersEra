import java.util.*;
class djpattern
{
    public static void main(String args[])
    {
       System.out.println("enter word");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       s=s.trim(); String s1="";
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               char ch1=ch;
               s1=s1+ ch+ ++ch1;
           }
           else
           {
               s1=s1+ch;
           }
       }
       System.out.println(s1);
    }
}