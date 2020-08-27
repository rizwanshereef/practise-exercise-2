package com.stackroute;

import java.util.Scanner;

public class Remove_vowel {
/*Main class to remove Vowel from string*/
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int len = 5;
        String name[] =new String[len];
/*Input places*/
        for (int i =0; i<len; i++) {
            System.out.print("Enter the Place "+(i+1)+": ");
            name[i] = s.nextLine();
        }
        rmv(name);


    }
/*Method to remove vowels from the array*/
    static void rmv(String name[])
    {
        int len = name.length;
        String new_name[] = new String[len];
        for(int i= 0; i<len;i++)
        {
/*Deleting Vowels by replacing letter with empty character*/
            new_name[i]= name[i].replace("a", "").replace("e","").replace("i","").replace("o","").replace("u","");
            System.out.println("Place name without Vowel: "+new_name[i]);
        }

    }
}
