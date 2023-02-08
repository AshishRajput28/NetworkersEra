class oyooya_yyoooa
{
    public static void main(String args[])
    {
        String s = "oyooya", s1 = "", s2 = "", s3 = "";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                for (int k = i; k < s.length(); k++)
                {
                    char ch1 = s.charAt(k);
                    if (ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u')
                    {
                        System.out.print(ch1);
                    }
                }
                break;
            }
            else
            {
                s1 += ch;
            }
        }
        System.out.print(s1);
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.print(ch);
            }
        }
    }
}
