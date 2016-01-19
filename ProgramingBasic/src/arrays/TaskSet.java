/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Vojtech Tosovsky
 */
public class TaskSet {

    public static int returnFirstElement(int array[]) {
        return array[0];
    }

    public static int returnSecondElement(int array[]) {
        return array[1];
    }

    public static int returnLastElement(int array[]) {
        int i = array.length - 1;
        return array[i];
    }

    public static int findMaximum(int[] array) {
        int max = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;

    }

    public static int findFirstIndexOfX(int[] array, int x) {
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }

        }

        return -1;
    }

    public static int findLastIndexOfX(int[] array, int x) {
        int i = array.length - 1;
        for (; i >= 0; i--) {
            if (array[i] == x) {
                return i;
            }

        }

        return -1;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;

        }
        return sum;
    }

    public static int sumOfPowers(int[] array) {
        int powSum = 0;
        for (int i = 0; i < array.length; i++) {
            powSum = array[i] * array[i] + powSum;

        }
        return powSum;
    }

    public static boolean doesAContainsAnyElmementFromB(int[] a, int[] b) {
        
       
        for (int i = 0; i < a.length; i++) {
            for (int u = 0; u < b.length; u++) {
                if (b[u] == a[i]) {
                    return true;
                }
            }
        
        }
        return false;

    }
    public static boolean doesAcontainsAllElmementFromB(int[] a, int[] b) {

        boolean present = false;
        for (int i = 0; i < b.length; i++) {
            for (int u = 0; u < a.length; u++) {
                if (a[u] == b[i]) {
                    present = true;
                break;
                }
            }
        }
        if (present == true) {
            return true;
        }
        return false;

    }

    public static void reverse(int[] array) {
    }

    public static int[] sortAscending(int[] array) {
        return array;
    }

    public static int[] sortDescending(int[] array) {
        return array;
    }

    public static boolean containsOnlyEven(int[] array) {
        return true;
    }

    public static boolean containsOnlyPrime(int[] array) {
        return true;
    }

    public static int[] notPrimeReplaceByNearestPrime(int[] array) {
        return array;

    }

    public static int returnManhattonDistanceOfTwoPoints(int[] a, int b[]) {
        int sum = 0;
        return sum;
    }

}
