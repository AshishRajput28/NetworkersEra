import java.util.*;
class removepair
{
    public static void main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine(); s=s.trim(); s+=" ";
        String word=""; int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch!=s.charAt(i+1))
            {
                word=word+ch;
            }
        }
        System.out.println(word);
    }
}