import java.util.*;
class count_word
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        str = str.toUpperCase();
        int len = str.length();
        StringTokenizer st = new StringTokenizer(str.substring(0, len - 1));
        int wordCount = st.countTokens();
        System.out.println(wordCount);
        String strArr[] = new String[wordCount];
        if (wordCount > 50)
        {
            System.out.println("Invalid Input!");
            System.out.println("Number of words should be upto 50 only.");
            return;
        }
        for (int i = 0; i < wordCount; i++)
        {
            strArr[i] = st.nextToken();
        }
        for (int i = 0; i < wordCount - 1; i++)
        {
            for (int j = 0; j < wordCount - i - 1; j++)
            {
                if (strArr[j].compareTo(strArr[j+1]) > 0)
                {
                    String t = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = t;
                }
            }
        }
        System.out.println(); //To Print a blank line
        System.out.println("Word\t\tWord Count");
        int count = 0;
        for (int i = 0; i < wordCount - 1; i++)
        {
            count++;
            if (!strArr[i].equals(strArr[i + 1]))
            {
                System.out.println(strArr[i] + "   \t\t" + count);
                count = 0;
            }
        }
        //Print last word of array
        count++;
        System.out.println(strArr[wordCount - 1] + "\t\t" + count);
    }
}