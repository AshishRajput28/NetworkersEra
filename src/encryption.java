import java.util.*;
public class encryption
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter sentence ");
        String ipStr = in.nextLine();
        int len = ipStr.length();
        char lastChar = ipStr.charAt(len - 1);
        if (lastChar != '.' && lastChar != '?' && lastChar != '!')
        {
            System.out.println("invalid input");
            return;
        }
        String str = ipStr.substring(0, len - 1);
        StringTokenizer st = new StringTokenizer(str);
        int wordCount = st.countTokens();
        String strArr[] = new String[wordCount];
        int potArr[] = new int[wordCount];
        for (int i = 0; i < wordCount; i++)
        {
            strArr[i] = st.nextToken();
            potArr[i] = computePotential(strArr[i]);
        }
        System.out.println("Potential:");
        for (int i = 0; i < wordCount; i++)
        {
            System.out.println(strArr[i] + " = " + potArr[i]);
        }
        /*
         * Sort potential array and words array
         * as per potential array
         */
        for (int i = 0; i < wordCount - 1; i++)
        {
            for (int j = 0; j < wordCount - i - 1; j++)
            {
                if (potArr[j] > potArr[j+1])
                {
                    int t = potArr[j];
                    potArr[j] = potArr[j+1];
                    potArr[j+1] = t;
                    String temp = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Sentence");
        for (int i = 0; i < wordCount; i++)
        {
            System.out.print(strArr[i] + " ");
        }
    }
    static int computePotential(String word)
    {
        String str = word.toUpperCase();
        int p = 0;
        int l = str.length();
        /*
         * Substracting 64 from ASCII Value of
         * letter gives the proper potentials:
         * A => 65 - 64 = 1
         * B => 66 - 64 = 2
         * ..
         * ..
         */
        for (int i = 0; i < l; i++)
        {
            p += str.charAt(i) - 64;
        }
        return p;
    }
}