import java.util.*;
class stringwordcount
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        str = str.toUpperCase();
        int len = str.length();
        StringTokenizer st = new StringTokenizer(str);
        int wordCount = st.countTokens();
        System.out.println(wordCount);
        String strArr[] = new String[wordCount];
        for(int i=0;i<wordCount;i++)
        {
            strArr[i]=st.nextToken();
        }
        System.out.println("check");
        for(int i=0;i<wordCount;i++)
        {
            System.out.println(strArr[i]);
        }
    }
}