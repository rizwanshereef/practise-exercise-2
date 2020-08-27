package com.stackroute;

import java.util.Scanner;

public class Remove_vowel {
/*Main class to remove Vowel from string*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = 5;
        String name[] =new String[len];
/*Input places*/
        for (int itr =0; itr<len; itr++) {
            System.out.print("Enter the Place "+(itr+1)+": ");
            name[itr] = scan.nextLine();
        }
        rmv(name);


    }
/*Method to remove vowels from the array*/
    static void rmv(String name[]){
        int len = name.length;
        String new_name[] = new String[len];
        for(int itr= 0; itr<len;itr++){
/*Deleting Vowels by replacing letter with empty character*/
            new_name[itr]= name[itr].replace("a", "").replace("e","").replace("itr","").replace("o","").replace("u","");
            System.out.println("Place name without Vowel: "+new_name[itr]);
        }

    }
}
