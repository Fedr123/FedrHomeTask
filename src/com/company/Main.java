package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /////// Task 1.1 ///////
        NonInitCharAndInt emptyValuesObj = new NonInitCharAndInt();

        System.out.println("Empty char:");
        System.out.println(emptyValuesObj.getEmptyChar());

        System.out.println("Empty int:");
        System.out.println(emptyValuesObj.getEmptyInt());


        /////// Task 1.2 ///////
        Dog dogSpot = new Dog("spot", "Ruff!");
        Dog dogScruffy = new Dog("“scruffy”", "Wurf");

        System.out.println("First dog: " + dogSpot.toString());
        System.out.println("Seconf dog: " + dogScruffy.toString());


        /////// Task 1.3 ///////
        Scanner in = new Scanner(System.in);
        System.out.println("Please, input INT for the task 1.3");
        int n = in.nextInt();
        System.out.println(CheckerAndCounter.isEven(n));


        /////// Task 1.4 ///////
        System.out.println("Please, input INT for the task 1.4");
        n = in.nextInt();
        System.out.println("Sum of digits: " + CheckerAndCounter.countSumOfDigits(n));


        /////// Task 1.5 ///////
        System.out.println("Please, input 2 DOUBLE values for the task 1.5");
        double[] pairOfDouble = new double[2];
        pairOfDouble[0] = in.nextDouble();
        pairOfDouble[1] = in.nextDouble();
        int result = CheckerAndCounter.chooseCloserToTen(pairOfDouble);

        if (result == +1){
            System.out.println("1'st value is closer to 10: " +  pairOfDouble[0]);
        }
        else if (result == -1){
            System.out.println("2'nd value is closer to 10: " +  pairOfDouble[1]);
        }
        else {
            System.out.println("Values are equal:" + pairOfDouble[0] +", "+  pairOfDouble[1]);
        }


        /////// Task 1.6 ///////
        System.out.println("Please, input 2 DOUBLE values for the task 1.6");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Perimeter of triangle equals " +  CheckerAndCounter.countPerim (a, b));
        System.out.println("Square of triangle equals " +  CheckerAndCounter.countSquare (a, b));


        /////// Task 1.7 ///////
        System.out.println("Please, input 3 DOUBLE values for the task 1.6");
        a = in.nextDouble();
        b = in.nextDouble();
        double c = in.nextDouble();
        pairOfDouble = CheckerAndCounter.findRoots(a, b, c);

        if (pairOfDouble == null) {
            System.out.println("No roots for this equation");
        } else {
            System.out.println ("Roots are: "+ pairOfDouble[0] +", "+ pairOfDouble[1]);
        }


        /////// Task 1.8 ///////
        System.out.println("Please, input 17-19 digits for the task 1.8");
        long fullData = in.nextLong();
        FullDataInOneNumber creature_1 = new FullDataInOneNumber(fullData);
        System.out.println(creature_1.toString());
    }
}
