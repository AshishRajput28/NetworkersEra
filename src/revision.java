// WAP to find area of circle & rectangle using method
// 1 - void circle(int r)
// 2 -  void rectangle(int l ,int b)
// 3 - double triangle(int base , int height)
// create main method and call the above method using object
// r,l,b should be user defined
import java.util.*;
class revision
{
    public static void main(String args[])
    {
       String word="",new_word=""; int length=0,max_length=0;
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       s1=s1+' ';
       for(int i=0;i<s1.length();i++)
       {
           char ch=s1.charAt(i);
           if(ch!=' ')
           {
               word=word+ch;
           }
           else
           {
               length=word.length();
               if(length>max_length)
               {
                   new_word=word;
                   max_length=length;
               }
               word="";
           }
       }
       System.out.println(new_word+" "+max_length);
    }
}