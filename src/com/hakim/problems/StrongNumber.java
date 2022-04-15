package com.hakim.problems;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        while(true){


            System.out.println("Enter the number : ");
            int num=input.nextInt();
            int i=num;
            int temp;
            int sum=0;

            while(i>0){
                temp=i%10;
                sum+=fact(temp);
                i/=10;
            }
            if(num==sum){
                System.out.println("Strong number");
            }else{
                System.out.println("Not");
            }
        }


    }

    private static int fact(int num){
        int factorial=1;
        for(int i=2;i<=num;i++){
            factorial*=i;
        }

        return factorial;
    }
}

//? 145
//? fact of 1 + fact of 4 + fact of 5 = 145
