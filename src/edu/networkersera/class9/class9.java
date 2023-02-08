package edu.networkersera.class9;

import java.util.*;
class class9
{
    public static void main(String args[])
    {
       int n=112334;
       int zero=0,o=0,t=0,th=0,fr=0,fv=0,s=0,sv=0,eg=0,nin=0;
       while (n>0)
       {
           int rem=n%10;
           if(rem==0) zero++;
           if(rem==1) o++;
           if(rem==2) t++;
           if(rem==3) th++;
           if(rem==4) fr++;
           if(rem==5) fv++;
           if(rem==6) s++;
           if(rem==7) sv++;
           if(rem==8) eg++;
           if(rem==9) nin++;
           n=n/10;
       }
       if(zero!=0) System.out.println(" zero = "+zero);
        if(o!=0)   System.out.println(" one = "+o);
        if(t!=0)   System.out.println(" two = "+t);
        if(th!=0)  System.out.println(" three = "+th);
        if(fr!=0)  System.out.println(" four = "+fr);
        if(fv!=0)  System.out.println(" five = "+fv);
        if(s!=0)   System.out.println(" six = "+s);
        if(sv!=0)  System.out.println(" seven = "+sv);
        if(eg!=0)  System.out.println(" eight = "+eg);
        if(nin!=0)  System.out.println(" nine = "+nin);
    }
}