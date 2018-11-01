package anikina.olga.tasks.java.main.secondTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraySort {
    private Integer[] array;
    private int[] arr;


    public ArraySort(final int size) {
        array = new Integer[size];
        initArray(array);
    }

    public void initArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            final Random random = new Random();
            array[i] = random.nextInt(100);
        }
    }

    public ArraySort(Integer[] array) {
        this.array = array;
    }

    public ArraySort(int[] arr) {
        this.arr = arr;
    }

    public Integer[] getArray() {
        return this.array;
    }

    private void swap(int value1, int value2) {
        int tmp = array[value1];
        array[value1] = array[value2];
        array[value2] = tmp;
    }

    public ArraySort bubbleSort() {
        ArraySort result = new ArraySort(this.array);
        for (int i = result.getArray().length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (result.getArray()[j] < result.getArray()[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
        return result;
    }

    public ArraySort insertSort() {
        ArraySort result = new ArraySort(this.array);
        for (int j = 1; j <= result.getArray().length - 1; j++) {
            int key = result.getArray()[j];
            for (int i = j - 1; i >= 0 && result.getArray()[i] < key; i--) {
                result.getArray()[i + 1] = result.getArray()[i];
                result.getArray()[i] = key;
            }
        }
        return result;
    }

    public ArraySort defaultSort() {
        ArraySort result = new ArraySort(this.array);
        Arrays.sort(result.getArray(), Collections.reverseOrder());
        return result;
    }

    public int[] insertSortToInt() {
        int[] result = this.arr;
        for (int j = 1; j <= result.length - 1; j++) {
            int key = result[j];
            for (int i = j - 1; i >= 0 && result[i] < key; i--) {
                result[i + 1] = result[i];
                result[i] = key;
            }
        }
        return result;
    }


    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + "  ";
        }
        return result;
    }
}
