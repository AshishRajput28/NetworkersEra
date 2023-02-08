import java.util.*;
class library
{
    String name; int price; int day; double fine;
    public void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name of the book=");
        name = sc.nextLine();
        System.out.println("enter printed price of the book=");
        price = sc.nextInt();
        System.out.println("for how many days fine needs to be paid=");
        day = sc.nextInt();
    }
    public void cal()
    {
        if (day <=7)
            fine = day *0.25;
        else if (day <=15)
            fine = (7*0.25) + ((day -7) *0.4);
        else if (day <=30)
            fine = (7*0.25) + (8*0.4) + ((day -15) *0.6);
        else
            fine = (7*0.25) + (8*0.4) + (15*0.6) + ((day -30) *0.8);
    }
    public void display()
    {
        System.out.println("name of the book="+ name);
        System.out.println("fine to be paid="+ fine);
    }
    public static void main(String args[])
    {
        library obj =new library();
        obj.input();
        obj.cal();
        obj.display();
    }
}
