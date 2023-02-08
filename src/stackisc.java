import java.util.Stack;
class stackisc
{
    public static void main ( String [] args)
    {
        Stack<String> b=new Stack<>();
        System.out.println(b);
        b.push("asr");
        b.push("pop");
        b.push("push");
        System.out.println(b);
        b.pop();
        b.push("hi");
        System.out.println(b);
        int s=b.search("asr");
        System.out.println(s);
    }
}
