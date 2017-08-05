package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String name1 = n.readLine();
        String name2 = n.readLine();
        int t1 = name1.length();
        int t2 = name2.length();
        if (name1.equals(name2))
            System.out.println("Имена идентичны");

        else if (t1 == t2)
            System.out.println("Длины имен равны");
                //напишите тут ваш код

    }
}
