package com.assignmentgeneticspractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumNumberPosition {

    private static int num1, num2, num3, Max;

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Scanner scanobj = new Scanner(System.in);

        System.out.println(" enter the number n1 : ");
        num1 = scanobj.nextInt();
        System.out.println(" enter the number n2 : ");
        num2 = scanobj.nextInt();
        System.out.println(" enter the number n3 : ");
        num3 = scanobj.nextInt();

        integerList.add(num1);
        integerList.add(num2);
        integerList.add(num3);
        for (Integer number : integerList)
            System.out.println(number);


        if (integerList.get(0) > integerList.get(1) && integerList.get(0) > integerList.get(2)) {
            System.out.println(" Maximum number in 1st Position ");}
        else  if (integerList.get(1) > integerList.get(0) && integerList.get(1) > integerList.get(2)) {
            System.out.println(" Maximum number in 2nd Position ");
        }
        else
            System.out.println("using anothet test case to check maximum number poition34");


    }
}


