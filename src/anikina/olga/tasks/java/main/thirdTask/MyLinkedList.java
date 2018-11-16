package anikina.olga.tasks.java.main.thirdTask;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    private int size;
    private MyLinkedList.Node<E> firstId = new Node<>(null, null, null);
    private MyLinkedList.Node<E> lastId;

    public MyLinkedList() {
        this.firstId = null;
    }

    public MyLinkedList(int size) {
        this.size = size;
    }

    private static class Node<E> {
        E item;
        private MyLinkedList.Node<E> next;
        private MyLinkedList.Node<E> prev;

        public Node(MyLinkedList.Node<E> first, E second, MyLinkedList.Node<E> last) {
            this.prev = first;
            this.item = second;
            this.next = last;
        }

        public Node() {
        }
    }

    @Override
    public void add(E element) {
        linkToAdd(element, null);
    }

    private void linkToAdd(E element, MyLinkedList.Node<E> node) {
        if (node == null) {
            MyLinkedList.Node prev = this.lastId;
            MyLinkedList.Node next = new MyLinkedList.Node(prev, element, null);
            this.lastId = next;
            if (prev == null) {
                this.firstId = next;
            } else {
                prev.next = next;
            }
        } else {
            MyLinkedList.Node prev = node.prev;
            MyLinkedList.Node next = new MyLinkedList.Node(prev, element, node);
            node.prev = next;
            if (prev == null) {

                this.firstId = next;
            } else {
                prev.next = next;
            }
        }
        ++this.size;

    }

    @Override
    public void add(int index, E element) {
        this.checkIncludeInBound(index);
        if (index == this.size) {
            add(element);
        } else {
            this.linkToAdd(element, this.node(index));
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E set(int index, E element) {
        this.checkIncludeInBound(index);
        MyLinkedList.Node<E> tmp = this.node(index);
        tmp.item = element;
        return tmp.item;
    }

    private MyLinkedList.Node<E> node(int index) {
        MyLinkedList.Node tmp = this.firstId;
        for (int i = 0; i < index; ++i) {
            tmp = tmp.next;
        }
        return tmp;

    }

    private void checkIncludeInBound(int index) {
        if ((index > this.size || index < 0)) {
            throw new IndexOutOfBoundsException("Index" + index + "don't included in MyLinkedList");
        }
    }

    @Override
    public E get(int index) {
        this.checkIncludeInBound(index);
        MyLinkedList.Node<E> tmp = this.node(index);
        return tmp.item;
    }

    @Override
    public void clear() {
        this.firstId = null;
        this.lastId = null;
        this.size = 0;
    }

    @Override
    public int indexOf(E element) {
        MyLinkedList.Node tmp = this.firstId;
        int count = 0;
        try {
            while (tmp.item != element) {
                tmp = tmp.next;
                count++;
            }

        } catch (NullPointerException e) {

            System.out.println("Element " + element + "is not in the list");
        }
        return count;
    }


    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < this.size; i++) {
            E tmp = this.node(i).item;
            result += this.get(i) + "  ";
        }
        result += " ]";
        return result;
    }

    @Override
    public E remove(int index) {

        MyLinkedList.Node<E> node = this.node(index);
        MyLinkedList.Node<E> prev = node.prev;
        MyLinkedList.Node<E> next = node.next;


        node.prev = next;
        if (node == firstId) {
            firstId = next;
            this.size--;
            return node.item;
        }
        if (next == null) {
            prev.next = null;
        } else {
            prev.next = next;
            next.prev = prev;
        }
        this.size--;
        return node.item;
    }

    @Override
    public Object[] toArray() {
        Object[] tmp = new Object[this.size];
        for (int i = 0; i < this.size; i++) {
            tmp[i] = this.node(i).item;
        }
        return tmp;
    }


    @Override
    public Iterator<E> iterator() {
        Iterator<E> iter = new Iterator<E>() {
            MyLinkedList.Node<E> cursor = firstId;

            @Override
            public boolean hasNext() {
                return cursor != null;
            }

            @Override
            public E next() {
                MyLinkedList.Node<E> tmp = cursor;
                cursor = cursor.next;
                return tmp.item;
            }
        };
        return iter;
    }


}
