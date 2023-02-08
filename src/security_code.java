import java.util.*;
class security_code
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter length = ");
        int len = in.nextInt();
        in.nextLine();
        if (len < 1 || len > 6)
        {
            System.out.println("Error Length of String should not exceed 6 characters ");
            return;
        }
        System.out.println("Enter Code:");
        String code = in.nextLine();
        for (int i = 0; i < len; i++)
        {
            char ch = code.charAt(i);
            if (Character.isLowerCase(ch))
            {
                System.out.println("Invalid Only uppercase letters permitted ");
                return;
            }
            if (ch < 'A' || ch > 'K')
            {
                System.out.println("Invalid Only letters between A and K are permitted ");
                return;
            }
            /*
             * ASCII Code should be odd as we are taking alternate letters
             * between A and K. We have already checked above that letter is
             * between A and K. Now if we check for odd then it means that letter
             * is one of A, C, E, G, I, K
             */
            if (ch % 2 == 0)
            {
                System.out.println("Invalid Only alternate letters permitted ");
                return;
            }
            //Check for repetition
            int count = 0;
            for (int j = 0; j < len; j++)
            {
                if (ch == code.charAt(j))
                {
                    count++;
                }
            }
            if (count > 1)
            {
                System.out.println("Invalid Letter repetition is not permitted ");
                return;
            }
        }
        System.out.println("Valid");
    }
}