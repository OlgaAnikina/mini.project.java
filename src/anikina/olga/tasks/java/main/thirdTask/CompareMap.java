package anikina.olga.tasks.java.main.thirdTask;

import java.util.*;

public class CompareMap {
    private Map<String, Integer> hashMap = new HashMap<>();
    private Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
    private Map<String, Integer> treeMap = new TreeMap<>();

    private static Long timeOfInsertInHashMap = 0l;
    private static Long timeOfInsertInTreeMap = 0l;
    private static Long timeOfInsertInLinkedHashMap = 0l;

    private static Long timeOfDeleteInHashMap = 0l;
    private static Long timeOfDeleteInTreeMap = 0l;
    private static Long timeOfDeleteInLinkedHashMap = 0l;

    private static Long timeOfSearchInHashMap = 0l;
    private static Long timeOfSearchInTreeMap = 0l;
    private static Long timeOfSearchInLinkedHashMap = 0l;

    private static String randomChar() {
        int rnd = (int) (Math.random() * 52);
        char base = (rnd < 26) ? 'A' : 'a';
        String result = "" + (char) (base + rnd % 26);
        return result;
    }

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            final Random random = new Random();
            hashMap.put(randomChar(), random.nextInt(100));
            linkedHashMap.put(randomChar(), random.nextInt(100));
            treeMap.put(randomChar(), random.nextInt(100));

        }
    }

    private void compareInsertEnd() {
        long startTimeOfInsertHashMAp = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            hashMap.put(randomChar(), i);
        }
        long finishTimeOfInsertHashMap = System.nanoTime() - startTimeOfInsertHashMAp;
        long startTimeOfInsertInLinkedHashMAp = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            linkedHashMap.put(randomChar(), i);
        }
        long finishTimeOfInsertInLinkedHashMAp = System.nanoTime() - startTimeOfInsertInLinkedHashMAp;
        long startTimeOfInsertTreeMap = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            hashMap.put(randomChar(), i);
        }
        long finishTimeOfInsertTreeMAp = System.nanoTime() - startTimeOfInsertTreeMap;
        timeOfInsertInHashMap += finishTimeOfInsertHashMap;
        timeOfInsertInLinkedHashMap += finishTimeOfInsertInLinkedHashMAp;
        timeOfInsertInTreeMap += finishTimeOfInsertTreeMAp;

    }

    private void compareDelete() {
        long startTimeOfHashMap = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashMap.remove(randomChar());

        }
        long finishTimeOfHashMap = System.nanoTime() - startTimeOfHashMap;
        long startTimeOfLinkedhashMap = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int size = linkedHashMap.size();
            linkedHashMap.remove(randomChar());
        }
        long finishTimeOfLinkedHashMap = System.nanoTime() - startTimeOfLinkedhashMap;
        long startTimeOfDeleteTreeSet = System.nanoTime();
        for (int i = 10000; i < 1000000; i++) {
            int size = treeMap.size();
            treeMap.remove(randomChar());
        }
        long finishTimeOfDeleteTreeMap = System.nanoTime() - startTimeOfDeleteTreeSet;
        timeOfDeleteInLinkedHashMap += finishTimeOfLinkedHashMap;
        timeOfDeleteInHashMap += finishTimeOfHashMap;
        timeOfDeleteInTreeMap += finishTimeOfDeleteTreeMap;
    }

    private void compareSearch() {
        long startTimeOfHashMap = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashMap.get(randomChar());
        }
        long finishTimeOfHashMap = System.nanoTime() - startTimeOfHashMap;
        long startTimeOfLinkedHashMap = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedHashMap.get(randomChar());
        }
        long finishTimeOfLinkedHashMap = System.nanoTime() - startTimeOfLinkedHashMap;
        long startTimeOfTreeMap = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeMap.get(randomChar());
        }
        long finishTimeOfTreeMap = System.nanoTime() - startTimeOfTreeMap;
        timeOfSearchInLinkedHashMap += finishTimeOfLinkedHashMap;
        timeOfSearchInHashMap += finishTimeOfHashMap;
        timeOfSearchInTreeMap += finishTimeOfTreeMap;
    }

    public void compareOperation() {
        System.out.println("Compare Maps collections:");
        for (int i = 10000; i < 30000; i += 5000) {
            init(i);
            compareInsertEnd();
            compareDelete();
            compareSearch();
        }
        System.out.println("Compare delete:");
        System.out.println("HashMap worked : " + timeOfDeleteInHashMap);
        System.out.println("LinkedHashMap worked : " + timeOfDeleteInLinkedHashMap);
        System.out.println("TreeMap worked : " + timeOfDeleteInTreeMap);
        System.out.println("Compare insert :");
        System.out.println("HashMap worked : " + timeOfInsertInHashMap);
        System.out.println("LinkedHashMap worked : " + timeOfInsertInLinkedHashMap);
        System.out.println("TreeMap worked : " + timeOfInsertInTreeMap);
        System.out.println("Compare search :");
        System.out.println("HashMap worked : " + timeOfSearchInHashMap);
        System.out.println("LinkedHashMap worked : " + timeOfSearchInLinkedHashMap);
        System.out.println("TreeMap worked : " + timeOfSearchInTreeMap);
    }
}
