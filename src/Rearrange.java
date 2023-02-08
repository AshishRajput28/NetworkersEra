import java.util.*;
class Rearrange
{
    String wrd="",newwrd="";
    Scanner sc=new Scanner(System.in);
    Rearrange()
    {
        wrd=""; newwrd="";
    }
    void readword()
    {
        wrd=sc.nextLine(); wrd=wrd.toUpperCase();
    }
    void vow_freq_vow_con()
    {
        int vowel=0,consonant=0;
        for(int i=0;i<wrd.length();i++)
        {
            char ch=wrd.charAt(i);
            {
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    vowel++;
                else
                    consonant++;
            }
        }
        System.out.println("vowel = "+vowel + " consonant = "+consonant);
    }
    void arrange()
    {
       String vowel="",consonant="";
        for(int i=0;i<wrd.length();i++)
        {
            char ch = wrd.charAt(i);
            {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    vowel=vowel+ch;
                else
                    consonant=consonant+ch;
            }
        }
        newwrd=vowel+consonant;
    }
    void display()
    {
        System.out.println("original word = "+wrd);
        System.out.println("rearranged word = "+newwrd);
    }
    public static void main(String args[])
    {
        Rearrange obj=new Rearrange();
        obj.readword();
        obj.vow_freq_vow_con();
        obj.arrange();
        obj.display();
    }
}