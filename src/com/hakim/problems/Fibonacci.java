package com.hakim.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first_num=0,second_num=1,user_input,result;

        Scanner input=new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see ?");
        user_input=input.nextInt();

        System.out.print("Fibonacci Series : 0 1 ");

        for(int i=1;i<=user_input - 2 ;i++){
            result=first_num+second_num;
            first_num=second_num;
            second_num=result;

            System.out.print(result+" ");
        }
    }
}
