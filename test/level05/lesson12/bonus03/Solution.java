package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(reader.readLine());
        if (N <= 0) return;
        int mass[];
        mass = new int[N+1];
        for(int i=0; i<N; i++)
        {
        int K=Integer.parseInt(reader.readLine());
        mass[i]=K;
        }
        int maximum=mass[0];
        for(int i=1; i<N-1; i++)
        {
         if (mass[i] > mass[i+1] && maximum < mass[i]) maximum = mass[i];
            else if (mass[i+1] > mass[i] && maximum < mass[i+1]) maximum = mass[i+1];
        }
        System.out.println(maximum);
    }
}
