package anikina.olga.tasks.java.main.thirdTask;

import java.util.*;

public class CompareSets {
    private Set<Integer> hashSet = new HashSet<>();
    private Set<Integer> linkedHashSet = new LinkedHashSet<>();
    private Set<Integer> treeSet = new TreeSet<>();

    private static Long timeOfInsertInHashSet = 0l;
    private static Long timeOfInsertInTreeSet = 0l;
    private static Long timeOfInsertInLinkedHashSet = 0l;

    private static Long timeOfDeleteInHashSet = 0l;
    private static Long timeOfDeleteInTreeSet = 0l;
    private static Long timeOfDeleteInLinkedHashSet = 0l;

    private static Long timeOfSearchInHashSet = 0l;
    private static Long timeOfSearchInTreeSet = 0l;
    private static Long timeOfSearchInLinkedHashSet = 0l;

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            final Random random = new Random();
            hashSet.add(random.nextInt(100));
            linkedHashSet.add(random.nextInt(100));
            treeSet.add(random.nextInt(100));
        }
    }

    private void compareInsertEnd() {
        long startTimeOfInsertHashSet = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            hashSet.add(i);
        }
        long finishTimeOfInsertHashSet = System.nanoTime() - startTimeOfInsertHashSet;
        long startTimeOfInsertInLinkedHashSet = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            linkedHashSet.add(i);
        }
        long finishTimeOfInsertInLinkedHashSet = System.nanoTime() - startTimeOfInsertInLinkedHashSet;
        long startTimeOfInsertTreeSet = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            hashSet.add(i);
        }
        long finishTimeOfInsertTreeSet = System.nanoTime() - startTimeOfInsertTreeSet;
        timeOfInsertInHashSet += finishTimeOfInsertHashSet;
        timeOfInsertInLinkedHashSet += finishTimeOfInsertInLinkedHashSet;
        timeOfInsertInTreeSet += finishTimeOfInsertTreeSet;

    }

    private void compareDelete() {
        long startTimeOfHashSet = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = hashSet.size();
            hashSet.remove(size - 1);
        }
        long finishTimeOfHashSet = System.nanoTime() - startTimeOfHashSet;
        long startTimeOfLinkedHashSet = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = linkedHashSet.size();
            linkedHashSet.remove(size - 1);
        }
        long finishTimeOfLinkedHashSet = System.nanoTime() - startTimeOfLinkedHashSet;
        long startTimeOfDeleteTreeSet = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            int size = treeSet.size();
            treeSet.remove(size - 1);
        }
        long finishTimeOfDeleteTreeSet = System.nanoTime() - startTimeOfDeleteTreeSet;
        timeOfDeleteInLinkedHashSet += finishTimeOfLinkedHashSet;
        timeOfDeleteInHashSet += finishTimeOfHashSet;
        timeOfDeleteInTreeSet += finishTimeOfDeleteTreeSet;
    }

    private void compareSearch() {
        long startTimeOfHashSet = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashSet.contains(i);
        }
        long finishTimeOfHashSet = System.nanoTime() - startTimeOfHashSet;
        long startTimeOfLinkedHashSet = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedHashSet.contains(i);
        }
        long finishTimeOfLinkedHashSet = System.nanoTime() - startTimeOfLinkedHashSet;
        long startTimeOfTreeSet = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeSet.contains(i);
        }
        long finishTimeOfTreeSet = System.nanoTime() - startTimeOfTreeSet;
        timeOfSearchInLinkedHashSet += finishTimeOfLinkedHashSet;
        timeOfSearchInHashSet += finishTimeOfHashSet;
        timeOfSearchInTreeSet += finishTimeOfTreeSet;
    }

    public void compareOperation() {
        System.out.println("Compare Sets collections:");
        for (int i = 10000; i < 30000; i += 5000) {
            init(i);
            compareInsertEnd();
            compareDelete();
            compareSearch();
        }
        System.out.println("Compare delete:");
        System.out.println("HashSet worked : " + timeOfDeleteInHashSet);
        System.out.println("LinkedHashSet worked : " + timeOfDeleteInLinkedHashSet);
        System.out.println("TreeSet worked : " + timeOfDeleteInTreeSet);
        System.out.println("Compare insert :");
        System.out.println("HashSet worked : " + timeOfInsertInHashSet);
        System.out.println("LinkedHashSet worked : " + timeOfInsertInLinkedHashSet);
        System.out.println("Tree worked : " + timeOfInsertInTreeSet);
        System.out.println("Compare search :");
        System.out.println("HashSEt worked : " + timeOfSearchInHashSet);
        System.out.println("LinkedHashSet worked : " + timeOfSearchInLinkedHashSet);
        System.out.println("TreeSet worked : " + timeOfSearchInTreeSet);
    }
}
