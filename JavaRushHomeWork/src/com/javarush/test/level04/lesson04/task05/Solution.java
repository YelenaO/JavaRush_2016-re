package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String sN = n.readLine();
        int nN = Integer.parseInt(sN);
        int s;
        if (nN < 0)
            s = nN + 1;
        else
            s = nN*2;
        System.out.println(s);
        //напишите тут ваш код

    }

}