import java.util.*;
class binary_search_num
{
    public static void main(String args[])
    {
        int i, n, item, first, last, middle;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter " + n + " integers");
        for (i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the search value:");
        item = sc.nextInt();
        first = 0; last = n - 1;
        middle = (first + last)/2;
        while( first <= last )
        {
            if ( array[middle] < item )
                first = middle + 1;
            else if ( array[middle] == item )
            {
                System.out.println(item + " found at location " + middle  + ".");
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(item + " is not found.\n");
    }
}