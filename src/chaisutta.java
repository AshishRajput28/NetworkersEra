class chaisutta
{
    public static void main(String args[])
    {
        String a="computer";
        int i; String vowel="",con="";
        for( i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                break;
            }
        }
        for(int k=i;k<a.length();k++)
        {
            char ch1=a.charAt(k);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
            {
                vowel=vowel+ch1;
            }
            else
            {
                con=con+ch1;
            }
        }
        System.out.println(con+a.substring(0,i)+vowel);
    }
}