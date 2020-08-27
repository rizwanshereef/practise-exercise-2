package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Consecutive {
/*Main class to check given series of 7 digits are consecutive*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("Enter the numbers separated by commas:");
        str = s.next();
/*Splitting string to array of numbers*/
        String[] values = str.split(",");
/*Check if number of digit if 7 if not exit*/
        if(values.length<7)
        {
          System.out.println(str+"\t non consecutive numbers");
        }
        else {
            cons(values,str);
        }

    }

/*Method to check if number is consecutive*/
    static public void cons(String[] values, String str)
    {
        int i, flag = 0;
        String[] ch = values;
        int[] num = new int[values.length];
        for (i = 0; i<values.length; i++)
        {
            num[i]= Integer.parseInt(ch[i]);
        }
/*Sorting Array to find consecutive*/
        Arrays.sort(num);
        for(i=0; i< num.length-1;i++)
        {
            /*Check if the present number is equal to the next number*/
            if((num[i+1] - num[i])==1)
            {
                flag = 1;

            }
            else {
                flag =0;
            }
        }

        if(flag == 1)
        {
            System.out.println(str+" are consecutive numbers");
        }
        else {
            System.out.println(str+" non consecutive numbers");
        }
    }
}
