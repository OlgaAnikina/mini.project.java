package anikina.olga.tasks.java.main.thirdTask;

import anikina.olga.tasks.java.main.firstTask.Circle;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyListVSDefault {
    private MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
    private List<Integer> list = new LinkedList<>();
    private static Long timeOfInsertInMyCollection = 0l;
    private static Long timeOfInsertInDefaultCollection = 0l;
    private static Long timeOfDeleteInMyCollection = 0l;
    private static Long timeOfDeleteInDefaultCollection = 0l;
    private static Long timeOfSearchInMyCollection = 0l;
    private static Long timeOfSearchInDefaultCollection = 0l;

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            final Random random = new Random();
            myLinkedList.add(random.nextInt(100));
            list.add(random.nextInt(100));
        }
    }

    private void compareInsertEnd() {
        long startTimeOfInsertInMyList = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            myLinkedList.add(i);
        }
        long finishTimeOfInsertInMyList = System.nanoTime() - startTimeOfInsertInMyList;
        long startTimeOfInsertInDefaultList = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            list.add(i);
        }
        long finishTimeOfInsertInDefaultList = System.nanoTime() - startTimeOfInsertInDefaultList;
        timeOfInsertInMyCollection += finishTimeOfInsertInMyList;
        timeOfInsertInDefaultCollection += finishTimeOfInsertInDefaultList;
    }

    private void compareDelete() {
        long startTimeOfMyList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            myLinkedList.remove(i);
        }
        long finishTimeOfMyList = System.nanoTime() - startTimeOfMyList;
        long startTimeOfDefaultList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.remove(i);
        }
        long finishTimeOfDefaultList = System.nanoTime() - startTimeOfDefaultList;
        timeOfDeleteInDefaultCollection += finishTimeOfDefaultList;
        timeOfDeleteInMyCollection += finishTimeOfMyList;
    }

    private void compareSearch() {
        long startTimeOfMyList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            myLinkedList.get(i);
        }
        long finishTimeOfMyList = System.nanoTime() - startTimeOfMyList;
        long startTimeOfDefaultList = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.get(i);
        }
        long finishTimeOfDefaultList = System.nanoTime() - startTimeOfDefaultList;
        timeOfSearchInDefaultCollection += finishTimeOfDefaultList;
        timeOfSearchInMyCollection += finishTimeOfMyList;
    }

    public void compareOperation() {
        System.out.println("Compare Operation in List:");
        for (int i = 10000; i < 30000; i += 5000) {
            init(i);
            compareInsertEnd();
            compareDelete();
            compareSearch();
        }
        System.out.println("Compare delete in of collections:");
        System.out.println("My  list worked : " + timeOfDeleteInMyCollection);
        System.out.println("Default list worked : " + timeOfDeleteInDefaultCollection);
        System.out.println("Compare insert in the end of collections:");
        System.out.println("My  list worked : " + timeOfInsertInMyCollection);
        System.out.println("Default list worked : " + timeOfInsertInDefaultCollection);
        System.out.println("Compare search in of collections:");
        System.out.println("My  list worked : " + timeOfSearchInMyCollection);
        System.out.println("Default list worked : " + timeOfSearchInDefaultCollection);
    }


}
