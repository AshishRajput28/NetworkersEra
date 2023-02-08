import java.util.*;
class Book
{
    String name[];
    int point;
    int max;
    public Book(int cap)
    {
        max=cap;
        point = -1;
        name = new String[max];
    }
    public void tell()
    {
        if(point == -1)
            System.out.println("SHELF EMPTY");
        else
            System.out.println("Last entered: "+name[point]);
    }
    public void add(String v)
    {
        if (point+1 == max)
            System.out.println("SHELF FULL");
        else
            name [++point] = v;
    }
    public void display()
    {
        if (point == -1)
            System. out.println("SHELF EMPTY");
        else
        {
            for(int i = 0; i <= point; i++)
                System.out.println(name[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Capacity of the bookshelf: ");
        int size = sc.nextInt();
        Book obj = new Book(size);
        while(true)
        {
            System.out.println("1. Last Entered");
            System.out.println("2. Add New");
            System.out.println("3. List All");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj.tell();
                    break;
                case 2:
                    System.out.print("Book title:");
                    String title=sc.nextLine();
                    obj.add(title);
                    break;
                case 3:
                    obj.display();
                    break;
                default:
                    break;
            }
        }
    }
}