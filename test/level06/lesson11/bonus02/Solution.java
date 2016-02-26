package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandpaName = reader.readLine();
        String grandmaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        
        /* Новое задание предполагает изменение создаваемых объектов. теперь за именем кошки должен следоваь ее отец (а не мать, как раньше)
        Пример:
        Сat catFather = new Cat(fatherName,null, catGrandpa); - тестирование не пройдет
        Cat catFather = new Cat(fatherName,catGrandpa, null); - пройдет
        Но после этих изменений нужно поменять конструктор (см. ниже)
        */
        
        Cat catFather = new Cat(fatherName,catGrandpa, null);
        Cat catMother = new Cat(motherName,null, catGrandma);

        String sonName = reader.readLine();
        String doughterName = reader.readLine();
        Cat catSon = new Cat(sonName,catFather,catMother);
        Cat catDaughter = new Cat(doughterName,catFather, catMother);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name)
        {
            this.name = name;
        }
        
        /*
Если конструктор не менять, то на выходе будет получаться нечто вроде
Cat name is мама Василиса, no mother, father is бабушка Василиса
Поэтому меняем коструктор из
Cat(String name,Cat mother, Cat father)
в 
Cat(String name,Cat father, Cat mother)
*/

        Cat(String name,Cat father, Cat mother)
        {
            this.name = name;
            this.mother= mother;
            this.father = father;
        }

        @Override
        public String toString()
        {
            if (mother == null && father==null )
                return "Cat name is " + name + ", no mother, no father";
            else
            if (mother == null)
                return "Cat name is " + name + ", no mother, "+"father is "+father.name;
            else
            if (father==null)
            return "Cat name is " + name +", mother is "+mother.name+", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name+", father is "+father.name;
        }
    }

}
