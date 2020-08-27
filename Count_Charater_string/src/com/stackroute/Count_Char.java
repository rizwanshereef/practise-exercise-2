package com.stackroute;

import java.util.Scanner;

public class Count_Char {
/*Main class to find the occurrence of each characters*/
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        System.out.println(str);
        charCount(str);


    }
/*Method to count characters and display*/
    static void charCount(String str){
        /*Array to count occurrence*/
        int count[] = new int[256];
        int len = str.length();

        /*initialize count array*/
        for(int i =0; i<len;i++) {
            count[str.charAt(i)]++;
        }

        char ch[] = new char[len];
        for(int i =0; i<len; i++){
/*Convert string to char array*/
            ch[i] = str.charAt(i);
            int cnt = 0;
            for(int j = 0; j<= i; j++){
                if(str.charAt(i)==ch[j])
                    cnt++;
            }
            
            if(cnt==1){
                System.out.println(str.charAt(i)+"......"+count[str.charAt(i)]);
            }
        }
    }
}
