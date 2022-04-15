/* package codechef; // don't place package name! */
package com.hakim.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefPassOrFail
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input=new Scanner(System.in);

        int N=input.nextInt();

        int X=input.nextInt();

        int P=input.nextInt();

        int failedMark=N-X;
        int passedMark=X*3;
        int totalMark=passedMark-failedMark;

        if(totalMark >= P){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

    }


}
