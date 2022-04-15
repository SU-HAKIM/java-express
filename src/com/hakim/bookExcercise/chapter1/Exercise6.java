package com.hakim.bookExcercise.chapter1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a side :");
        int side=input.nextInt();

        double area=((3*Math.sqrt(3))/2)*(side*side);

        System.out.println("Area of Hexagon is :"+area);
    }
}
