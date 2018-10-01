package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(OnlyOdd("Andy Pun"));

    }
    public static String OnlyOdd(String str)
    {
        int i = 0;
        String odd = "", even = "";
        while (i < str.length())
        {
            if (i%2 == 0)
            {
                even = even + str.substring(i, i + 1);
                i++;
            }
            else
            {
                odd = odd + str.substring(i, i + 1);
                i++;
            }
        }
        return odd;
    }
}

