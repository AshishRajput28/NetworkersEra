import java.util.*;
class firstlastinterchange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine(); s=s.trim(); s+=" ";
        String word="";
        int len=s.length();
        for (int i=0; i<len; i++)
        {
            if (s.charAt(i)==' ')
            {
                System.out.print(word.charAt(word.length()-1)+word.substring(1,word.length()-1)+word.charAt(0)+" ");
                word = "";
            }
            else
            {
                word =word+ s.charAt(i);
            }
        }
    }
}