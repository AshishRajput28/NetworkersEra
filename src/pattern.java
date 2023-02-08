import java.util.*;
class pattern
{
    public static void  main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sentence");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        int n=st.countTokens();
        System.out.println(n);
        String  str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=st.nextToken();
        }
        System.out.println("check");
        for(int i=0;i<n;i++)
        {
            System.out.println("index="+i+" -"+str[i]);
        }
    }
}
