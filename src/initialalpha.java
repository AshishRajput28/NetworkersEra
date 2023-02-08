import java.util.*;
class initialalpha
{
    int i=1;
    int count=0;
    int pronic(int n)
    {
        if(i<=n)
        {
            if(n==i*(i+1))
            {
                count++;
            }
            else
            {
                i++;
                pronic(n);
            }
        }
        return count;
    }
}


