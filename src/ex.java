import java.util.*;
public class ex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); char ch,ch1; int i,k;
        for(i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                break;
            }
        }
        for( k=s.length()-1;k>=0;k--) //topiho
        {
            ch1=s.charAt(k);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
            {
                break;
            }
        }
        System.out.println(s.substring(i+1,k)+s.substring(0,i+1)+s.substring(k,s.length()));
    }
}
