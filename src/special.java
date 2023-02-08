import java.util.*;
class special
{
   public static void main(String args[])
   {
     System.out.println("enter sentence");
     Scanner sc=new Scanner(System.in);
     String s1=sc.nextLine();
     s1=s1.trim();
     s1=" "+s1+" ";
     int count=0;
     for(int i=0;i<s1.length()-1;i++)
     {
         char ch=s1.charAt(i);
         if(ch==' ')
         {
             char c=s1.charAt(i+1);
             if(Character.isUpperCase(c))
             {
                 count++;
                 for(int j=i+1;j<s1.length();j++)
                 {
                     char ch1=s1.charAt(j);
                     if(ch1==' ')
                     {
                         System.out.println(s1.substring(i,j));
                         break;
                     }
                 }
             }
         }
     }
     System.out.println(count);
   }
}