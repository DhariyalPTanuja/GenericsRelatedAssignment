package com.assignmentgeneticspractice;


import java.util.Scanner;
public class GenericNumberMaximumPosition {

    private static int num1, num2, num3, Max;
    private static float fnum1, fnum2, fnum3;
    private static String snum1, snum2, snum3;


    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest
        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
            System.out.println(" the maximum position is 2nd ");
        }
        else if (z.compareTo(max) > 0)
        {
            max = z; // z is the largest
            System.out.println(" the maximum position is 3rd ");
        } else {
            System.out.println(" the maximum position is 1st ");
        }
        return max;

    }

    public static void intInputValue(){
        Scanner scanobj = new Scanner(System.in);
        System.out.println(" enter the number n1 : ");
        num1 = scanobj.nextInt();
        System.out.println(" enter the number n2 : ");
        num2 = scanobj.nextInt();
        System.out.println(" enter the number n3 : ");
        num3 = scanobj.nextInt();

    }
    public static void floatInputValue(){
        Scanner scanobj = new Scanner(System.in);
        System.out.println(" enter the float number n1 : ");
        fnum1 = scanobj.nextFloat();
        System.out.println(" enter the float number n2 : ");
        fnum2 = scanobj.nextFloat();
        System.out.println(" enter the float number n3 : ");
        fnum3 = scanobj.nextFloat();
    }
    public static void stringInputValue(){
        Scanner scanstringobj = new Scanner(System.in);
        System.out.println(" enter the String  s1 : ");
        snum1 = scanstringobj.next();
        System.out.println(" enter the String s2 : ");
        snum2 = scanstringobj.next();
        System.out.println(" enter the String s3 : ");
        snum3 = scanstringobj.next();
    }
    public static void main(String[] args) {
        intInputValue();
       System.out.println("Maximum of " + num1 + " , " + num2 + "," + num3 + " : " + maximum(num1,num2,num3) );
        floatInputValue();
        System.out.println("Maximum of " + fnum1 + " , " + fnum2 + "," + fnum3 + " : " + maximum(fnum1,fnum2,fnum3) );
        stringInputValue();
        System.out.println("Maximum of " + snum1 + " , " + snum2 + "," + snum3 + " : " + maximum(snum1,snum2,snum3) );


    }

}
