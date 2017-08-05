package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true){
            String s = n.readLine();
            int k = Integer.parseInt(s);
            if (k == -1){
                count = count + k;
                break;
            }
            count = count + k;
        }
        System.out.println(count);
        //напишите тут ваш код
    }
}

/*
while (true)
{
    String s = buffer.readLine();
    if (s.equals("exit"))
        break;
}
 */