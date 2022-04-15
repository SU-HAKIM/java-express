package com.hakim.bookExcercise.chapter1;

import java.util.Scanner;

public class VolumeOfABox {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter length: ");
        int length=input.nextInt();
        System.out.println("Enter width: ");
        int width=input.nextInt();
        System.out.println("Enter Height: ");
        int height = input.nextInt();


        int volume=length*width*height;
        System.out.println("Volume : "+volume);
    }
}
