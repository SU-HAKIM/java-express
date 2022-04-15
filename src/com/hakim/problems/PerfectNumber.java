package com.hakim.problems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=input.nextInt();

        int result=1;

        for(int i=2;i<= num/2;i++){
            if(num%i==0){
                result+=i;
            }
        }

        if(result==num){
            System.out.println("Perfect Number.");
        }else{
            System.out.println("Not");
        }
    }
}
