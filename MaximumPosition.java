package com.assignmentgeneticspractice;

import java.util.Scanner;

public class MaximumPosition <T extends  Comparable<T>>{
 T x, y, z;
    private static int num1, num2, num3, Max;
    private static float fnum1, fnum2, fnum3;
    private static String snum1, snum2, snum3;
 public MaximumPosition(T x, T y, T z){
     this.x = x;
     this.y = y;
     this.z = z;

 }
 public T maximum(){
     return  MaximumPosition.maximum(x, y, z);
 }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0)
        {
            max = z;
        }
        printMax(x, y, z, max);

        return max;

    }
    public static String maximumTest(String x, String y, String z) {
       String max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0)
        {
            max = z;
        }
        printMax(x, y, z, max);

        return max;
    }
    private static <T> void printMax(T x, T y, T z, T max) {
        System.out.println("Maximum of " + x + " , " + y + "," + z + " : " + max );
        if ( max.equals(x)) {
            System.out.println(" Max Number at 1st Position ");
        } else if ( max.equals(y)){
                System.out.println(" Max Number at 2nd Position ");
        } else
            System.out.println(" Max Number at 3rd Position ");
    }
    public static int[] intInputValue(){
        Scanner scanobj = new Scanner(System.in);
        System.out.println(" enter the number n1 : ");
        num1 = scanobj.nextInt();
        System.out.println(" enter the number n2 : ");
        num2 = scanobj.nextInt();
        System.out.println(" enter the number n3 : ");
        num3 = scanobj.nextInt();

        return new int[]{num1, num2, num3};
    }
    public static float[] floatInputValue(){
        Scanner scanobj = new Scanner(System.in);
        System.out.println(" enter the float number n1 : ");
        fnum1 = scanobj.nextFloat();
        System.out.println(" enter the float number n2 : ");
        fnum2 = scanobj.nextFloat();
        System.out.println(" enter the float number n3 : ");
        fnum3 = scanobj.nextFloat();
        return new float[]{fnum1, fnum2, fnum3};
    }
    public static String[] stringInputValue(){
        Scanner scanstringobj = new Scanner(System.in);
        System.out.println(" enter the String  s1 : ");
        snum1 = scanstringobj.next();
        System.out.println(" enter the String s2 : ");
        snum2 = scanstringobj.next();
        System.out.println(" enter the String s3 : ");
        snum3 = scanstringobj.next();
        return new String[]{snum1, snum2, snum3};
    }

    public static void main(String[] args) {
       int numberI[] = intInputValue();
      float numberF[] =   floatInputValue();
      String  str[] =  stringInputValue();
        MaximumPosition.maximumTest(snum1, snum2, snum3);
        MaximumPosition.maximum(num1, num2, num3 );
        MaximumPosition.maximum(fnum1, fnum2, fnum3 );




    }
}
