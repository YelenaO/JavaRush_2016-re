package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String name = n.readLine();
        String sN1 = n.readLine();
        String sN2 = n.readLine();
        int nN1 = Integer.parseInt(sN1);
        int nN2 = Integer.parseInt(sN2);
        System.out.println(name + " получает " + nN1 + " через " + nN2 + " лет.");
        //напишите тут ваш код

    }
}