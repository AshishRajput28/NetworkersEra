import java.util.*;
class consectuiveletter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine(); s=s.trim(); s+=" ";
        String word=""; int count=0;
        int len=s.length();
        for (int i=0; i<len; i++)
        {
            if (s.charAt(i)==' ')
            {
                int wordLen = word.length();
                for (int j = 0; j < wordLen - 1; j++)
                {
                    if (word.charAt(j) + 1 == word.charAt(j + 1))
                    {
                        count++;
                        System.out.println(word.charAt(j)+""+word.charAt(j+1));
                    }
                }
                word = "";
            }
            else
            {
                word =word+ s.charAt(i);
            }
        }
        System.out.println("consecutive letters: " + count);
    }
}