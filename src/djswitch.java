import java.util.*;
class djswitch
{
    public static void main(String args[])
    {
       System.out.println("enter sentence");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       s=s.trim(); int count_space=0,count_alphabet=0;
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(ch==' ')
           {
               count_space++;
           }
           else if(ch!=' ')
           {
               count_alphabet++;
           }
       }
       System.out.println("number of space="+count_space);
       System.out.println("number of character="+count_alphabet);
       System.out.println("number of word="+(count_space+1));
    }
}