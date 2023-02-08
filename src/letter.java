import java.util.*;
class letter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word");
        String  st=sc.nextLine(); String newword=""; int p=0;
        for(int i=0;i<st.length();i++)
        {
            char ch= st.charAt(i);
           if(Character.isLetter(ch))
           {
               if(Character.isLowerCase(ch))
               {
                   p=(int)ch;
                   p-=32;
                   System.out.print((char)p);
               }
               else
               {
                   p=(int)ch;
                   p+=32;
                   System.out.print((char)p);
               }
               p=0;
           }
           else
           {
               System.out.print(ch);
           }
        }
    }
}