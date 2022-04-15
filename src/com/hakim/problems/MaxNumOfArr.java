package com.hakim.problems;

import java.util.Scanner;

public class MaxNumOfArr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers;
        System.out.println("How many numbers do you want to enter : ");
        int length=input.nextInt();
        numbers=new int[length];
        System.out.println("Enter those numbers :");
        for(int i=0;i<length;i++){
            numbers[i]=input.nextInt();
        }

        int max=max_number(numbers,length);
        System.out.println("Max number is "+max);
    }

    private static int max_number(int[] arr,int length){
        int max=arr[0];

        for(int i=0;i<length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }

        return max;
    }
}
