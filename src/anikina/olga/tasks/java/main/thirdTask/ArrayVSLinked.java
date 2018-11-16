package anikina.olga.tasks.java.main.thirdTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayVSLinked {
    private List<Integer> arrayList = new ArrayList<>();
    private List<Integer> linkedList = new LinkedList<>();
    private static Long timeOfInsertInArrayInEnd = 0l;
    private static Long timeOfInsertInListInEnd = 0l;
    private static Long timeOfInsertInArrayInBeginning = 0l;
    private static Long timeOfInsertInListInBeginning = 0l;

    private static Long timeOfDeleteInArrayInEnd = 0l;
    private static Long timeOfDeleteInListInEnd = 0l;
    private static Long timeOfDeleteInArrayInBeginning = 0l;
    private static Long timeOfDeleteInListInBeginning = 0l;

    private static Long timeOfSearchInArray = 0l;
    private static Long timeOfSearchInList = 0l;

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            final Random random = new Random();
            arrayList.add(random.nextInt(100));
            linkedList.add(random.nextInt(100));
        }
    }

    private void compareInsertEnd() {
        long startTimeOfInsertInArray = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            arrayList.add(i);
        }
        long finishTimeOfInsertInArray = System.nanoTime() - startTimeOfInsertInArray;
        long startTimeOfInsertInList = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            linkedList.add(i);
        }
        long finishTimeOfInsertInList = System.nanoTime() - startTimeOfInsertInList;
        timeOfInsertInArrayInEnd += finishTimeOfInsertInArray;
        timeOfInsertInListInEnd += finishTimeOfInsertInList;

    }

    private void compareInsertBeginning() {
        long startTimeOfInsertInArray = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            arrayList.set(0, i);
        }
        long finishTimeOfInsertInArray = System.nanoTime() - startTimeOfInsertInArray;
        long startTimeOfInsertInList = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            linkedList.set(0, i);
        }
        long finishTimeOfInsertInList = System.nanoTime() - startTimeOfInsertInList;
        timeOfInsertInArrayInBeginning += finishTimeOfInsertInArray;
        timeOfInsertInListInBeginning += finishTimeOfInsertInList;

    }

    private void compareDeleteInEnd() {
        long startTimeOfArray = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = arrayList.size();
            arrayList.remove(size - 1);
        }
        long finishTimeOfArray = System.nanoTime() - startTimeOfArray;
        long startTimeOfList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = linkedList.size();
            linkedList.remove(size - 1);
        }
        long finishTimeOfList = System.nanoTime() - startTimeOfList;
        timeOfDeleteInListInEnd += finishTimeOfList;
        timeOfDeleteInArrayInEnd += finishTimeOfArray;
    }

    private void compareDeleteInBeginning() {
        long startTimeOfArray = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = arrayList.size();
            arrayList.remove(0);
        }
        long finishTimeOfArray = System.nanoTime() - startTimeOfArray;
        long startTimeOfList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = linkedList.size();
            linkedList.remove(0);
        }
        long finishTimeOfList = System.nanoTime() - startTimeOfList;
        timeOfDeleteInListInBeginning += finishTimeOfList;
        timeOfDeleteInArrayInBeginning += finishTimeOfArray;
    }

    private void compareSearch() {
        long startTimeOfArray = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(i);
        }
        long finishTimeOfArray = System.nanoTime() - startTimeOfArray;
        long startTimeOfList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(i);
        }
        long finishTimeOfList = System.nanoTime() - startTimeOfList;
        timeOfSearchInList += finishTimeOfList;
        timeOfSearchInArray += finishTimeOfArray;
    }

    public void compareOperation() {
        System.out.println("Compare Operation List and Array:");
        for (int i = 10000; i < 30000; i += 5000) {
            init(i);
            compareInsertEnd();
            compareDeleteInEnd();
            compareSearch();
            compareInsertBeginning();
            compareDeleteInBeginning();
        }
        System.out.println("Compare delete in the end in collections:");
        System.out.println("Array  worked : " + timeOfDeleteInArrayInEnd);
        System.out.println("List worked : " + timeOfDeleteInListInEnd);
        System.out.println("Compare delete in the beginning in collections:");
        System.out.println("Array  worked : " + timeOfDeleteInArrayInBeginning);
        System.out.println("List worked : " + timeOfDeleteInListInBeginning);
        System.out.println("Compare insert in the end of collections:");
        System.out.println("Array worked : " + timeOfInsertInArrayInEnd);
        System.out.println("List worked : " + timeOfInsertInListInEnd);
        System.out.println("Compare insert in the beginning of collections:");
        System.out.println("Array worked : " + timeOfInsertInArrayInBeginning);
        System.out.println("List worked : " + timeOfInsertInListInBeginning);
        System.out.println("Compare search in collections:");
        System.out.println("Array worked : " + timeOfSearchInArray);
        System.out.println("List worked : " + timeOfSearchInList);
    }


}
