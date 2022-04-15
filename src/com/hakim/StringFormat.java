package com.hakim;

public class StringFormat {
    public static void main(String[] args) {

        printBinary('f');
        printBinary('$');
        printBinary('j');

    }

    public static void printBinary(char a){
        int value=a;

        System.out.println(Integer.toBinaryString(value));
    }
}
