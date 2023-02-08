import java.util.*;
class dj
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a word");
      String  s=sc.nextLine();
       String word="";
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
                word=word+ ++ch;
           }
           else
           {
               word=word+ch;
           }
       }
       System.out.println(word);
    }
}


