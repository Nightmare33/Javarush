package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mass[];
        mass = new int[3];
        for (int i = 0; i < 3; i++)
        {
            String s = reader.readLine();
            mass[i] = Integer.parseInt(s);
        }
        for (int i = 2; i > 0; i--)
            for (int j = 0; j < i; j++)
            {
                if (mass[j] > mass[j + 1])
                {
                    int tmp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = tmp;
                    //напишите тут ваш код
                }
            }
        System.out.println(mass[1]);
    }
}