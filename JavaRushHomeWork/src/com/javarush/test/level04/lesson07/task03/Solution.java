package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String n1 = n.readLine();
        int a = Integer.parseInt(n1);
        String n2 = n.readLine();
        int b = Integer.parseInt(n2);
        String n3 = n.readLine();
        int c = Integer.parseInt(n3);
        int count = 0;
        if ( a > 0)
            count++;
        if ( b > 0)
            count++;
        if (c > 0)
            count++;
        System.out.println(count);
    }
}
