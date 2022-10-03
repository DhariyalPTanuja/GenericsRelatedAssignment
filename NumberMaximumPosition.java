package com.assignmentgeneticspractice;

import java.util.Scanner;

public class NumberMaximumPosition {
    private static int inum1, inum2, inum3, intMaximumNumber;
    private static float fnum1, fnum2, fnum3, floatMaximumNumber;
    private static String snum1, snum2, snum3, stringMaximumNumber;


    public static void integerNumberMax(){
        Scanner scanobj = new Scanner(System.in);
        System.out.println(" enter the int number n1 : ");
        inum1 = scanobj.nextInt();
        System.out.println(" enter the int number n2 : ");
        inum2 = scanobj.nextInt();
        System.out.println(" enter the int number n3 : ");
        inum3 = scanobj.nextInt();

        if( inum1 > inum2 && inum1 > inum3){
            intMaximumNumber = inum1;
            System.out.println("Maximum number in 1st Position");
        } else if( inum2 > inum1 && inum2 > inum3){
            intMaximumNumber = inum2;
            System.out.println("Maximum number in 2nd Position");
        } else {
            intMaximumNumber = inum3;
            System.out.println("Maximum number in 3rd Position");
        }

    }
    public static void floatNumberMax(){
        Scanner scanobj = new Scanner(System.in);
        System.out.println(" enter the float number n1 : ");
        fnum1 = scanobj.nextFloat();
        System.out.println(" enter the float number n2 : ");
        fnum2 = scanobj.nextFloat();
        System.out.println(" enter the float number n3 : ");
        fnum3 = scanobj.nextFloat();

        if( fnum1 > fnum2 && fnum1 > fnum3){
            floatMaximumNumber = fnum1;
            System.out.println("Maximum number in 1st Position");
        } else if(fnum2 > fnum1 && fnum2 > fnum3){
            floatMaximumNumber = fnum2;
            System.out.println("Maximum number in 2nd Position");
        } else {
            floatMaximumNumber = fnum3;
            System.out.println("Maximum number in 3rd Position");
        }

    }
    public static void stringNumberMax(){
        Scanner scanstringobj = new Scanner(System.in);
        System.out.println(" enter the String  s1 : ");
        snum1 = scanstringobj.next();
        System.out.println(" enter the String s2 : ");
        snum2 = scanstringobj.next();
        System.out.println(" enter the String s3 : ");
        snum3 = scanstringobj.next();
        int c11 = snum1.compareTo(snum2);
        int c12 = snum1.compareTo(snum3);
        int c21 = snum2.compareTo(snum3);


        if( c11 > 0 && c12 > 0){
            stringMaximumNumber = snum1;
            System.out.println( "Maximum String at 1st Position :" + snum1);
        } else if(c11 < 0 && c21 > 0){
            stringMaximumNumber = snum2;
            System.out.println("Maximum String at 2nd Position : " + snum2);
        } else {
            stringMaximumNumber = snum3;
            System.out.println("Maximum number in 3rd Position : " + snum3);
        }

    }
    public static void main(String[] args) {
        integerNumberMax();
       floatNumberMax();
        stringNumberMax();
    }
}
