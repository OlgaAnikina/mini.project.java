package anikina.olga.tasks.java.test;
import anikina.olga.tasks.java.main.thirdTask.MyLinkedList;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTests {
    private MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
    private void initLinkedList() {
        myLinkedList.add(1);
        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(15);

    }
    @Test
    public void isSizeRight() {
        initLinkedList();
        assertEquals(4, myLinkedList.size());
    }

    @Test
    public void isAddRight() {
        initLinkedList();
        myLinkedList.add(1,3);
        assertEquals(5, myLinkedList.size());
    }

    @Test
    public void isSetRight() {
        initLinkedList();
        myLinkedList.set(1,3);
        assertEquals(4, myLinkedList.size());
    }

    @Test
    public void isGetRight() {
        initLinkedList();
        int result = myLinkedList.get(0);
        assertEquals(1,result);
    }

    @Test
    public void isRemoveRightFirstElement() {
        initLinkedList();
        int result = myLinkedList.remove(0);
        assertEquals(1, result);
    }

    @Test
    public void isRemoveRightEndElement() {
        initLinkedList();
        int result = myLinkedList.remove(3);
        assertEquals(15, result);
    }

    @Test
    public void isRemoveRightSeveralElement() {
        initLinkedList();
        int result = myLinkedList.remove(1);
        assertEquals(5, result);
    }

    @Test
    public void isClearRight() {
        initLinkedList();
        myLinkedList.clear();
        assertEquals(0, myLinkedList.size());
    }

    @Test
    public void isIndexOfRight() {
        initLinkedList();
        assertEquals(2, myLinkedList.indexOf(10));
    }

}
