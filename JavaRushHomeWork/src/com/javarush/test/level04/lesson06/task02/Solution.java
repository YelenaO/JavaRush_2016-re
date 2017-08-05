package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import javax.sql.rowset.serial.SerialStruct;
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String n1 = n.readLine();
        String n2 = n.readLine();
        String n3 = n.readLine();
        String n4 = n.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);
        int d = Integer.parseInt(n4);

        int max1, max2, max;
        if (a > b)
            max1 = a;
        else
            max1 = b;
        if (c > d)
            max2 = c;
        else
            max2 = d;
        if (max1 > max2)
            max = max1;
        else
            max = max2;
        System.out.println(max);
        //напишите тут ваш код

    }
}
