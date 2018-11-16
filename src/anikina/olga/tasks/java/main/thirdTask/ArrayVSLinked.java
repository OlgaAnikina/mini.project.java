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
    private static Long timeOfDeleteInArrayInEnd = 0l;
    private static Long timeOfDeleteInListInEnd = 0l;
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
        long startTimeOfInsertInMyList = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            arrayList.add(i);
        }
        long finishTimeOfInsertInMyList = System.nanoTime() - startTimeOfInsertInMyList;
        long startTimeOfInsertInDefaultList = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            linkedList.add(i);
        }
        long finishTimeOfInsertInDefaultList = System.nanoTime() - startTimeOfInsertInDefaultList;
        timeOfInsertInArrayInEnd += finishTimeOfInsertInMyList;
        timeOfInsertInListInEnd += finishTimeOfInsertInDefaultList;

    }

    private void compareDelete() {
        long startTimeOfMyList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = arrayList.size();
            arrayList.remove(size - 1);
        }
        long finishTimeOfMyList = System.nanoTime() - startTimeOfMyList;
        long startTimeOfDefaultList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = linkedList.size();
            linkedList.remove(size - 1);
        }
        long finishTimeOfDefaultList = System.nanoTime() - startTimeOfDefaultList;
        timeOfDeleteInListInEnd += finishTimeOfDefaultList;
        timeOfDeleteInArrayInEnd += finishTimeOfMyList;
    }

    private void compareSearch() {
        long startTimeOfMyList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(i);
        }
        long finishTimeOfMyList = System.nanoTime() - startTimeOfMyList;
        long startTimeOfDefaultList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(i);
        }
        long finishTimeOfDefaultList = System.nanoTime() - startTimeOfDefaultList;
        timeOfSearchInList += finishTimeOfDefaultList;
        timeOfSearchInArray += finishTimeOfMyList;
    }

    public void compareOperation() {
        System.out.println("Compare Operation List and Array:");
        for (int i = 10000; i < 30000; i += 5000) {
            init(i);
            compareInsertEnd();
            compareDelete();
            compareSearch();
        }
        System.out.println("Compare delete in the end in collections:");
        System.out.println("Array  worked : " + timeOfDeleteInArrayInEnd);
        System.out.println("List worked : " + timeOfDeleteInListInEnd);
        System.out.println("Compare insert in the end of collections:");
        System.out.println("Array worked : " + timeOfInsertInArrayInEnd);
        System.out.println("List worked : " + timeOfInsertInListInEnd);
        System.out.println("Compare search in collections:");
        System.out.println("Array worked : " + timeOfSearchInArray);
        System.out.println("List worked : " + timeOfSearchInList);
    }


}
