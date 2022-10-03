package com.assignmentgeneticspractice;

import java.util.Scanner;

public class NumberMaximumPosition {
    private static int num1, num2, num3, intMaximumNumber;
    public static void integerNumberMax(){
        Scanner scanobj = new Scanner(System.in);
        System.out.println(" enter the number n1 : ");
        num1 = scanobj.nextInt();
        System.out.println(" enter the number n2 : ");
        num2 = scanobj.nextInt();
        System.out.println(" enter the number n3 : ");
        num3 = scanobj.nextInt();

        if( num1 > num2 && num1 >num3){
            intMaximumNumber =num1;
            System.out.println("Maximum number in 1st Position");
        } else if( num2 > num1 && num2 >num3){
            intMaximumNumber =num2;
            System.out.println("Maximum number in 2nd Position");
        } else {
            intMaximumNumber =num3;
            System.out.println("Maximum number in 3rd Position");
        }

    }
    public static void main(String[] args) {
        integerNumberMax();
    }
}
