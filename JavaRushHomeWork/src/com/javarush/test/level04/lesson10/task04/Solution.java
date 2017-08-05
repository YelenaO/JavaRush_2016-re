package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        int j = 0;
        String t = "S";


        while ( j < 10){
            int i = 0;
            while (i < 10){
                System.out.print(t);
                i++;
            }
            System.out.println();
            j++;
        }
        //напишите тут ваш код

    }
}
