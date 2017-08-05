package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String n1 = n.readLine();
        String n2 = n.readLine();
        String n3 = n.readLine();
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);

        if ( a > b &&  b > c)
        {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if (a > c && c > b){
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
        else if ( b > c && c > a){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        }
        else if (b > a && a > c){
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if (c > a && a > b){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
            //напишите тут ваш код

    }
}
