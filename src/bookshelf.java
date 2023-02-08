import java.util.*;
class bookshelf
{
    String name[];
    int point, max;
    public bookshelf(int cap)
    {
        point = -1;
        max = cap;
        name = new String[max];
    }
    void tell()
    {
        if (point == -1)
        {
            System.out.println(" -empty- ");
        }
        else
        {
            System.out.println(name[point]);
            point = point - 1;
        }
    }
    void add(String v)
    {
        if (point == max - 1)
            System.out.println("full");
        else
        {
            point = point + 1;
            name[point] = v;
        }
    }
    void display()
    {
        if (point == -1)
        {
            System.out.println("empty");
        }
        else
        {
            for (int i = point; i >= 0; i--)
            {
                System.out.println(name[i]);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bookshelf obj = new bookshelf(n);
        while (true)
        {
            System.out.println("1. Last Entered");
            System.out.println("2. Add New");
            System.out.println("3. List All");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    obj.tell();break;
                case 2:
                    System.out.print(" Book title =");
                    String title = sc.nextLine();
                    obj.add(title);break;
                case 3:
                    obj.display();break;
                default: break;
            }
        }
    }
}
