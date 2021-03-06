package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String n1 = n.readLine();
        int a = Integer.parseInt(n1);
        String n2 = n.readLine();
        int b = Integer.parseInt(n2);
        String n3 = n.readLine();
        int c = Integer.parseInt(n3);
        int countPositive = 0;
        int countNegative = 0;
        if ( a > 0)
            countPositive++;
        if (a < 0)
            countNegative++;
        if ( b > 0)
            countPositive++;
        if (b < 0)
            countNegative++;
        if (c > 0)
            countPositive++;
        if (c < 0)
            countNegative++;
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
        // /напишите тут ваш код

    }
}
