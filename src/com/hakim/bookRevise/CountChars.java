package com.hakim.bookRevise;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string : ");

        String text=input.nextLine().toLowerCase();
        char[] textArr=text.toCharArray();

        int[] counts=new int[26];//? 0 - 25
        //? 97 - 122


        for(int i=0;i<textArr.length;i++){
            if(Character.isLetter(textArr[i])){
                int index = textArr[i] - 'a';
                counts[index]++;
            }
        }

        for(int i=0;i<counts.length;i++){
            if(counts[i]!=0){
                char letter=(char) (i+'a');
                System.out.printf("%c came %d times.\n",letter,counts[i]);
            }
        }

    }
}
