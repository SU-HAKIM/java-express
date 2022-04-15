package com.hakim.bookRevise;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter : ");
        int numbers=input.nextInt();

        int[] arr=new int[numbers];

        for(int i=0;i<numbers;i++){
            arr[i]=input.nextInt();
        }

        int sum=0;
        double avg=0;
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        avg=(double) sum/arr.length;

        System.out.println("Sum of arr : "+sum);
        System.out.println("Average of sum : "+avg);
        System.out.println("Minimum number : "+min);
        System.out.println("Maximum number : "+max);


    }
}
