package com.hakim;

public class WrapperClass {
    public static void main(String[] args) {
        int longNumber=1_000_000_000;

        changeSystem(longNumber);
    }

    public static void changeSystem(int billion){
        String hexBillion=Integer.toHexString(billion);
        String binBillion=Integer.toBinaryString(billion);
        String octaBillion=Integer.toOctalString(billion);

        System.out.println("Billion in HexDecimal: "+hexBillion);
        System.out.println("Billion in Binary : "+binBillion);
        System.out.println("Billion in Octal : : "+octaBillion);
    }
}
