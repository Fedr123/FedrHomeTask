package com.company;

/**
 * Created by vakula on 11.6.2016.
 */
public class CheckerAndCounter {
    static String isEven(int num) {
        if (num % 2 == 0) {
            return num + " is really even!";
        }
        else if (num % 2 == 1) {
            return "Unfortunately, " + num + " isn't even.";
        }
        else { //it never used
            return "Something going wrong...";
        }
    }


    static int countSumOfDigits(Integer num) {
        char [] arrOfDigits = num.toString().toCharArray();
        int sum = 0;
        for (char c : arrOfDigits) {
            sum += Integer.parseInt(Character.toString(c));
        }
        return sum;
    }

    static int chooseCloserToTen(double[] pairOfDouble) {
        double zeroDiff = pairOfDouble[0] - 10;
        double firstDiff = pairOfDouble[1] - 10;
        return Double.compare(zeroDiff, firstDiff);
    }

    static double countPerim(double a, double b) {

        double c = Math.sqrt((a*a + b*b));
        double perim = a + b +c;
        return perim;
    }

    static double countSquare(double a, double b) {
        double square = (a * b) / 2;
        return square;
    }

    //aX^2 + bX + c = 0
    static double[] findRoots(double a, double b, double c) {
        double D = b*b -4*a*c;
        double[] roots = new double[2];

        if (D > 0 || D == 0) {
            roots[0] = (-b + Math.sqrt(D)) / (2 * a);
            roots[1] = (-b - Math.sqrt(D)) / (2 * a);
        }
        else {
            roots = null;
        }

        return roots;
    }
}
