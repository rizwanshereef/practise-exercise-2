package com.stackroute;

import java.util.Scanner;

public class LargestElement {
/*Class to find the largest element in the array*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int len = scan.nextInt();
        int num[]=new int[len];
        for(int i =0; i<len; i++){
            System.out.println("Enter the number "+(i+1));
            num[i]=scan.nextInt();
        }

        System.out.println(" The largest element is:"+findlarge(num));

    }

    /*Method to find the largest number*/
    public static int findlarge(int num[]){
        int len =  num.length;
        int max = 0;
        for(int i=0;i<len;i++){
/*Check if max value is greater than current value of m if then replace max with number*/
            if(max<num[i]){
                max= num[i];
            }
        }
        return max;
    }
}
