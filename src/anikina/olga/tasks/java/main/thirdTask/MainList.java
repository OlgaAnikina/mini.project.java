package anikina.olga.tasks.java.main.thirdTask;

import java.util.Iterator;

public class MainList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(15);

        System.out.println(myLinkedList.toString());
        Iterator<Integer> iter = myLinkedList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }

    }
}
