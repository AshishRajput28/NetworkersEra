import java.util.*;
class Pseudoarithmetic
{
    int n, a[], ans, flag, sum, r;
    Pseudoarithmetic()
    {
        n = 0; flag = 0; sum = 0;
    }
    void accept(int nn)
    {
        Scanner sc = new Scanner(System.in);
        int n = nn;
        a=new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
    }
    boolean check()
    {
        if (n % 2 == 0)
        {
            int i = 0, p = n - 1;
            while (i < p)
            {Scanner sc = new Scanner(System.in);
                r = a[i] + a[p];
                if ((r == (a[i + 1] + a[p - 1]) && (r * 3) == sum))
                {
                    flag = 0;
                }
                p = p - 1;
                i = i + 1;
            }
        }
        else if (n % 2 != 0)
        {
                    int i = 0, p = n - 1;
                    while (i <= p)
                    {
                        r = a[i] + a[p];
                        if ((r == (a[i + 1] + a[p - 1])) && (r * 3) == sum)
                        {
                            flag = 0;
                        }
                        else
                        {
                            flag = 1;
                        }
                        p = p - 1;
                        i = i + 1;
                    }
                }
                if (flag == 0)
                    return true;
                else
                    return false;
            }
            public static void main(String args[])
            {
                Pseudoarithmetic obj=new Pseudoarithmetic();
                obj.accept(6);
                obj.check();
            }
        }
