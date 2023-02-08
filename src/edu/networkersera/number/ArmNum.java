package edu.networkersera.number;

import java.util.*;
class ArmNum
{
    int n,l;
    ArmNum(int nm)
    {
        n=nm;
        l=("" +n).length();
    }
    int sum_pow(int i)
    {
        if(i<10)
            return (int)Math.pow(i,l);
        else
            return sum_pow(i/10)+sum_pow(i%10);
    }
    public void isArmstrong()
    {
        if(n==sum_pow(n))
            System.out.println("Armstrong "+n);
        else
            System.out.println("Not Armstrong "+n);
    }
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArmNum asr=new ArmNum(num);
        asr.isArmstrong();
    }
}