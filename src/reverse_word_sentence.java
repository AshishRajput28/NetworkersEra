import java.util.*;
class reverse_word_sentence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sentence");
        String s=sc.nextLine();
        s=s+" ";
        String g="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                g=ch+g;
            }
            else
            {
                System.out.print(g+" ");
                g="";
            }
        }
    }
}
