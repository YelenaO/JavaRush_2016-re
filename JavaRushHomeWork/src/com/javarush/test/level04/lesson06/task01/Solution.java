package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String n1 = n.readLine();
        String n2 = n.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
         if ( a <  b)
             System.out.println(a);
        else
             System.out.println(b);
        //напишите тут ваш код

    }
}