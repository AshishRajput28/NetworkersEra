import java.util.*;
class freq
{
    public static void main(String args[])
    {
        int c=0,f=0;
        char x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String st=sc.nextLine();
        st=st.trim();
        st=st.toUpperCase();
        for(int i=0;i<st.length()-1;i++)
        {
            x=st.charAt(i);
            if(st.indexOf(x)!=st.lastIndexOf(x))
            {
                for(int j=i+1;j<st.length();j++)
                {
                    char y=st.charAt(j);
                    if(x==y)
                        st=st.substring(0,j)+st.substring(j+1,st.length());
                }
            }
        }
        System.out.println(st);
    }
}