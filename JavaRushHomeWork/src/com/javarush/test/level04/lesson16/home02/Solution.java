package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String n1 = n.readLine();
        String n2 = n.readLine();
        String n3 = n.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);

        if ( a > b && b > c)
            System.out.println(b);
        else if (a > c && c > b)
            System.out.println(c);
        else if ( b > c && c > a)
            System.out.println(c);
        else if ( b > a && a > c)
            System.out.println(a);
        else if ( c > a && a > b )
            System.out.println(a);
        else
            System.out.println(b);


        //напишите тут ваш код
    }
}
