package com.hakim.bookRevise;

import java.util.Arrays;
import java.util.Scanner;

public class UnlimitedArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int userInput;
        int[] arr=new int[10];
        int size=0;

        while(true){
            userInput=input.nextInt();

            if(userInput==-1){
                System.out.println("End of user input .");
                break;
            }

            if(size==arr.length){
                int length=arr.length * 2;
                arr= Arrays.copyOf(arr,length);
            }

            arr[size]=userInput;

            size++;
        }

        if(arr.length>size){
            arr=Arrays.copyOfRange(arr,0,size);
        }


        System.out.println(Arrays.toString(arr));

    }
}

//? length =10
//? input =12
//? left=20-12=8;