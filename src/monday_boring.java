import java.util.*;
class monday_boring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first word");
        String a=sc.nextLine();
        System.out.println("enter second word");
        String b=sc.nextLine();
        char a1[]=new char[a.length()];
        char b1[]=new char[b.length()];
        for(int i=0;i<a.length();i++)
        {
            a1[i]=a.charAt(i);
        }
        System.out.println(a1);
        for(int i=0;i<b.length();i++)
        {
            b1[i]=b.charAt(i);
        }
        int largest;
        if(a1.length>b1.length)
        {
            largest=a1.length;
        }
        else
        {
            largest=b1.length;
        }
        int b1c=0,a1c=0;
        for(int i=0;i<=largest;i++)
        {
            char ch=a1[a1c];
            char cp=b1[b1c];
            if(ch!='a'&& ch!='e'&& ch!='i'&&ch!='o'&&ch!='u')
            {
                if(cp!='a'&&cp!='e'&&cp!='i'&&cp!='o'&&cp!='u')
                {
                    char temp=b1[b1c];
                    b1[b1c]=a1[a1c];
                    a1[a1c]=temp;
                    a1c++;
                    b1c++;
                }
                if(cp=='a'||cp=='e'||cp=='i'||cp=='o'||cp=='u')
                    b1c++;
            }
            else
                a1c++;
        }
        System.out.println(a1);
        System.out.println(b1);
    }
}