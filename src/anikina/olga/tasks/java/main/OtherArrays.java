package anikina.olga.tasks.java.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Here methods for task # 4 - 5(work with arrays)
Method's names mean which character of task.
 */
public class OtherArrays {
    int[] arrayOfInt;

    private void aToDo() {
        int n = 100;
        arrayOfInt = new int[n / 2];
        arrayOfInt[0] = 1;
        for (int i = 1; i < n / 2; i++) {
            arrayOfInt[i] = arrayOfInt[i - 1] + 2;
        }

    }

    public void aDirectOrder() {
        aToDo();
        System.out.println(toString());
    }

    public void aReverseOrder() {
        aToDo();
        String result = "";
        for (int i = arrayOfInt.length - 1; i > -1; i--) {
            result += arrayOfInt[i] + "  ";
        }
        System.out.println(result);
    }

    public void bToDo() {
        int n = 20;
        int[] array = new int[n];
        int countOfEvenNumbers = 0;
        int countOfOddNumbers = 0;
        for (int i = 0; i < 20; i++) {
            array[i] = getRandom(0, 10);
            if ((array[i] % 2) == 0)
                countOfEvenNumbers++;
            else countOfOddNumbers++;
        }
        System.out.println("Array with value on [0;10]: ");
        System.out.println(toString(array));
        System.out.println(" That array has " + countOfEvenNumbers
                + " even numbers and  " + countOfOddNumbers + "  odd numbers");
    }

    public void cToDo() {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(1, 100);
        }
        System.out.println("Original array:");
        System.out.println(toString(array));
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println(" Change value of array");
        System.out.println(toString(array));
    }

    public void dToDo() {
        int n = 15;
        int max = -100, maxId = -1, min = 100, minId = -1;

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(-50, 50);
            if (array[i] < min) {
                min = array[i];
                minId = i;
            } else if (array[i] > max) {
                max = array[i];
                maxId = i;
            }
        }
        System.out.println("Create array with value in [-50;50] :");
        System.out.println(toString(array));
        System.out.println("That array have maximal element  = " + max + " on pisition: "
                + maxId + " and minimal element = " + min + " on pisition: " + minId);

    }

    public void eToDo() {
        int n = 10, sumOfArray1 = 0,
                sumOfArray2 = 0;
        int average1 = 0, average2 = 0;
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = getRandom(0, 10);
            sumOfArray1 += array1[i];
            array2[i] = getRandom(0, 10);
            sumOfArray2 += array2[i];
        }
        average1 = sumOfArray1 / array1.length;
        average2 = sumOfArray2 / array1.length;
        System.out.println("First  array:   and have average = " + average1);
        System.out.println(toString(array1));
        System.out.println("Second  array:   and have average = " + average2);
        System.out.println(toString(array2));
        if (average1 > average2) {
            System.out.println("First array has average more than second array");
        } else if (average1 < average2) {
            System.out.println("Second array has average more than first array");
        } else {
            System.out.println("First array has average more than second array");
        }
    }

    public void fToDo() {
        int n = 20;
        int[] counter = new int[3];

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(-1, 1);
            if (array[i] == -1) {
                counter[0]++;
            } else if (array[i] == 0) {
                counter[1]++;
            } else {
                counter[2]++;
            }
        }
        System.out.println(toString(array));
        Map<Integer, Integer> mapCounter = new HashMap<>();
        mapCounter.put(-1, counter[0]);
        mapCounter.put(0, counter[1]);
        mapCounter.put(1, counter[2]);
        int keyOfMaxValue1 = Collections.max(mapCounter.entrySet(),
                Map.Entry.comparingByValue()).getKey();
        int maxValue1 = mapCounter.remove(keyOfMaxValue1);
        int keyOfMaxValue2 = Collections.max(mapCounter.entrySet(),
                Map.Entry.comparingByValue()).getKey();
        int maxValue2 = mapCounter.remove(keyOfMaxValue2);
        if (maxValue1 == maxValue2) {
            System.out.println("Most often come elements: "
                    + keyOfMaxValue1 + " and " + keyOfMaxValue2);
        } else {
            System.out.println("Most often comes element: " + keyOfMaxValue1);
        }
    }

    private int getRandom(int min, int max) {
        return (min + (int) (Math.random() * ((max - min) + 1)));
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < arrayOfInt.length; i++) {
            result += arrayOfInt[i] + "  ";
        }
        return result;
    }

    public String toString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + "  ";
        }
        return result;
    }


}
