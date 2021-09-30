package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {

    private Node head;

    public LinkedListBasedImpl() {

    }

    @Override
    public int pop() {
        if (head != null) {
            Node last = head;
            Node previous = head;

            if (head.next == null) this.head = null;

            while (last.next != null) {
                previous = last;
                last = last.next;
            }

            previous.next = null;

            return last.elem;
        }
        throw new IllegalStateException("There is no element in the list");
    }

    @Override
    public void push(int x) {
        if (head == null) {
            head = new Node(x);
        }

        else {
            Node last = head;

            while (last.next != null) {
                last = last.next;
            }

            last.next = new Node(x);
        }
    }

    @Override
    public int numOfElems() {
        int num = 0;

        for (Node n = head; n != null; n = n.next) num++;

        return (num + 1);
    }

    @Override
    public int peek() {
        if (head != null) {
            Node temp = head;
            head = head.next;

            return temp.elem;
        }

        throw new IllegalStateException("There is no list");
    }

    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
        }
    }
}
