package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicate {
/*Main class to input array and remove duplicate entries*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Elements in the array");
        int len = s.nextInt();
        int num[] = new int[len];
        /*Input elements*/
        for(int i =0; i<len; i++){
            System.out.println("Enter the number "+(i+1));
            num[i]= s.nextInt();
        }
/*Sorting the array*/
        Arrays.sort(num);
/*Invoke method len*/
        len= rmdup(num);
/*Print updated Array*/
        System.out.println("Updated Array after removing duplicate entries");
        for(int i =0; i<len ; i++) {
            System.out.print(num[i]+" ");
        }

    }

    /*Method to remove duplicate entries*/
    static int rmdup(int num[]){
        int len = num.length;
        int temp[] = new int[len];
        int j =0;
        for(int i =0; i<len-1; i++) {
/*Check if the present element is equal to next element*/
            if(num[i]!= num[i+1]) {
                temp[j++] = num[i];
            }
        }
        temp[j++] = num[len-1];

        // replacing original value

        for(int i=0;i<j;i++) {
            num[i] = temp[i];
        }

        return j;
    }
}
