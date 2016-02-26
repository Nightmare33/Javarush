package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int mass [];
        mass = new int[5];
        for (int i=0; i<5;i++)
        {
            String s=reader.readLine();
            mass[i] = Integer.parseInt(s);
        }
        for (int i=4; i>0; i--)
            for (int j=0; j<i; j++)
            {
                if (mass[j]>mass[j+1])
                {
                    int tmp = mass [j];
                    mass [j] = mass [j+1];
                    mass [j+1]= tmp;
                }
            }
        for (int i=0; i<5;i++)
        {
            System.out.println(mass[i]);
        }
        //напишите тут ваш код
    }
}
