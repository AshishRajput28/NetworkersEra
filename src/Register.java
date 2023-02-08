import java.util.Scanner;
class Register
{
    String stud[];
    int cap;
    int top;
    public Register(int max)
    {
        top = -1;
        cap = max;
        if(cap > 5)
            cap = 5;
        stud = new String[cap];
    }
    public void push(String n)
    {
        if(top + 1 < cap)
            stud[++top] = n;
        else
            System.out.println("OVERFLOW");
    }
    public String pop()
    {
        if(top == -1)
            return "$$";
        else
        return stud[top--];
    }
    public void display()
    {
        if(top== -1)
            System.out.println("Register empty.");
        else
        {
            System.out.println("Student List:");
            for(int i = 0; i <= top; i++)
                System.out.println(stud[i]);
        }
    }
    public static void main(String args[ ])
    {
        Scanner sc = new Scanner(System.in);
        System. out.print("Maximum size: ");
        int max = sc.nextInt();
        Register obj = new Register(max);
        while(true)
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display”");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Student Name: ");
                    String n = sc.next();
                    obj.push(n);
                    break;
                case 2:
                    n = obj.pop();
                    if(n.equals("$$"))
                    System.out.println("UNDERFLOW!");
                    else
                    System.out.println(n + "  popped  ");
                    break;
                case 3:
                    obj.display();
                    break;
                default:
                    System.out.println("Exiting");
                    return;
            }
        }
    }
}