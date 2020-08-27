package com.stackroute;


import java.util.Scanner;

public class LongestWord {

    /*Main class to find the longest word of the string*/
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input 1:");
        String str = s.nextLine();
/* Break the input to array of words*/
        String[] words =str.split(" ");

        String longest ="";

        for(int i=0; i< words.length; i++) {
            /*Check if the length of each word is greater than longest */
            if(words[i].length() > longest.length())
                longest = words[i];
        }

        System.out.println("Output 1= "+longest);
    }
}
