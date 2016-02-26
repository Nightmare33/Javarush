package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = reader.readLine();
        int a = 0;
        int sum =0;
        while (!s.equalsIgnoreCase("сумма"))
        {
            a = Integer.parseInt(s);
            sum = sum + a;
            s = reader.readLine();
        }
        System.out.println(sum);
        //напишите тут ваш код
    }
}
