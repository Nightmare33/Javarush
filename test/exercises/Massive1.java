package com.javarush.test.exercises;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Massive1
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mass[] = new int[20];
        for (int i=0; i<20; i++)
        {
            String s=reader.readLine();
            int a = Integer.parseInt(s);
            mass[i]=a;
        }
        //Инициализируйте (создайте и заполните) массив тут
        return mass;
    }

    public static int max(int[] array) {
        int max=0;
        for (int i=0;i<20; i++)
        {
            if (max <= array[i])
                max=array[i];
        }
        //Найдите максимальное значение в этом методе
        return max;
    }
}
