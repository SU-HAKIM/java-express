package com.hakim.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Enter a word : ");
            String text=input.next();

            StringBuffer strBuffer=new StringBuffer(text);
            String str=strBuffer.reverse().toString();
            if(text.equals(str)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a palindrome");
            }
        }
    }
}//? If reversed string is same as before , this is a palindrome