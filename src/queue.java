import java.util.*;
public class queue
{
    public final static int MAX = 50;/*Defining the max size of the queue*/
    public static int queue[] = new int[MAX];
    public static int front = -1, rear = -1;
    public static void enqueue(int data) /* function to enqueue data */
    {
        if(rear == MAX - 1)
        {
            System.out.print("\nQueue is Full!");
        }
        else
        {
            rear = rear + 1;
            queue[rear] = data;
            if(front == -1)
            {
                front = 0;
            }
        }
    }
    public static void disp() /* function to display the elements of the queue */
    {
        System.out.print("\nThe elements in the queue are:");
        if(front == -1)
        {
            System.out.print("\nQueue is Empty");
        }
        else
        {
            for(int i = front; i <= rear; i++)
            {
                System.out.print(queue[i] + "  ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) /* main function for all input and output statements */
    {
        int data, size;
        System.out.print("Enter the size of queue: ");
        size = STDIN_SCANNER.nextInt();
        for(int i = 0; i < size; i++)
        {
            System.out.println("\nEnter Data to Enqueue:");
            data = STDIN_SCANNER.nextInt();
            System.out.println("Enqueuing " + data);
            enqueue(data);
            disp();
        }
    }
    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}