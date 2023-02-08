import java.util.*;
class capital_word_vowel_count
{
    public static void main(String args[])
    {
        System.out.println("enter a sentence");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int fre=0;
        a=" "+a+" ";
        for(int i=0;i<a.length()-1;i++)
        {
            char ch=a.charAt(i);
            if(ch==' ')
            {
                char c=a.charAt(i+1);
                if(Character.isUpperCase(c)&&c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                {
                    fre++;
                    for(int j=i+1;j<a.length();j++)
                    {
                        char ch1 = a.charAt(j);
                        if (ch1==' ')
                        {
                            System.out.println(a.substring(i,j));
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("fre of word "+fre);
    }
}