package com.hakim.bookRevise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();

        System.out.println("What do you want to do : ");
        System.out.println("+ for addition.");
        System.out.println("- for subtraction.");
        System.out.println("* for multiplication.");
        System.out.println("/ for division.");

        char operator=input.next().charAt(0);
        System.out.println("How many Operands : ");
        int operands=input.nextInt();

        System.out.println("Enter numbers : ");

        while(operands > 0){
            list.add(input.nextInt());
            operands--;
        }



        switch(operator){
            case '+' -> System.out.println("Result : "+plus(list));
            case '-' -> System.out.println("Result : "+minus(list));
            case '*' -> System.out.println("Result : "+multiply(list));
            case '/' -> System.out.println("Result : "+division(list));
        }

    }

    private static int plus(List<Integer> list){
        int sum=0;

        for(Integer integer:list){
            sum+=integer;
        }

        return sum;
    }


    private static int minus(List<Integer> list){
        int sub=list.get(0);

        for(Integer integer:list){
            sub-=integer;
        }

        return sub;
    }


    private static int multiply(List<Integer> list){
        int mul=1;

        for(Integer integer:list){
            mul*=integer;
        }

        return mul;
    }


    private static double division(List<Integer> list){
        double div=list.get(0);

        for(Integer integer:list){
            div/=integer;
        }

        return div;
    }


}
