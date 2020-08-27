package com.stackroute;

import java.util.Scanner;

public class Count_Char {
/*Main class to find the occurrence of each characters*/
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();
        System.out.println(str);
        charCount(str);


    }
/*Method to count characters and display*/
    static void charCount(String str){
        /*Array to count occurrence*/
        int count[] = new int[256];
        int len = str.length();

        /*initialize count array*/
        for(int itr =0; itr<len;itr++) {
            count[str.charAt(itr)]++;
        }

        char ch[] = new char[len];
        for(int itr =0; itr<len; itr++){
/*Convert string to char array*/
            ch[itr] = str.charAt(itr);
            int cnt = 0;
            for(int j = 0; j<= itr; j++){
                if(str.charAt(itr)==ch[j])
                    cnt++;
            }
            
            if(cnt==1){
                System.out.println(str.charAt(itr)+"......"+count[str.charAt(itr)]);
            }
        }
    }
}
