import java.util. Scanner;
class TheString
{
    String str;
    int len;
    int wordCount;
    int cons;
    public TheString()
    {
        str=new String();
        len=0;
        wordCount=0;
        cons=0;
    }
    public TheString(String ds)
    {
        str=ds;
        if(str. length()> 100)
            str=str. substring(0, 101);
        len=str.length();
        wordCount=0;
        cons=0;
    }
    public void countFreq()
    {
        int i;
        for(i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            wordCount++;
            ch=Character.toUpperCase(ch);
            switch(ch)
            {
                case 'A':
                case'E':
                case 'I':
                case 'O':
                case 'U':
                    break;
                default:
                    if(ch>='A' && ch<='Z')
                    cons++;
            }
        }
        if(len>0)
            wordCount++;
    }
    public void display()
    {
        System. out.println("Original String :"+str);
        System.out.println("Number of character: "+wordCount);
        System.out.println("Number of consonants:"+cons);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        TheString obj=new TheString(s);
        obj.countFreq();
        obj.display();
    }
}