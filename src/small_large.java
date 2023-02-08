class small_large
{
    static String minWord = "", maxWord = "";
    static void minMaxLengthWords(String input)
    {
        input=input.trim();
        int len = input.length();
        int a = 0, b = 0;
        int min_length = len, min_index = 0, max_length = 0, max_index = 0;
        while (b<=len)
        {
            if (b < len && input.charAt(b) != ' ')
            {
                b++;
            }
            else
            {
                int word_length = b - a;
                if (word_length < min_length)
                {
                    min_length = word_length;
                    min_index = a;
                }

                if (word_length > max_length)
                {
                    max_length = word_length;
                    max_index = a;
                }
                b++;
                a=b;
            }
        }
        minWord = input.substring(min_index, min_index+min_length);
        maxWord = input.substring(max_index, max_index+max_length);
    }
    public static void main(String[] args)
    {
        String a = "today is not that day";
        minMaxLengthWords(a);
        System.out.print("Minimum : " + minWord + "\nMaximum: " + maxWord);
    }
}
