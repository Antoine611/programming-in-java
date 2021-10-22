package agh.ii.prinjava.proj1.impl;


import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    /**
     * Here we Instantiate a Double linked list as a Queue
     * This is the constructor of the Queue
     */
    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /**
     * The objective of this method is to add a new node to final position of the queue
     * It uses the "addLast" method
     * @see DLinkList#addLast(Object)
     * @param x : Node to add to last position
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /**
     * The objective of this method is to remove node in first position of the queue
     * It uses the "removeFirst" method
     * @see DLinkList#removeFirst()
     * @return value of the removed node
     */
    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    /**
     * Gets the length of the list
     * @return integer which is the list size
     */
    @Override
    public int numOfElems() {
        return elems.getSize();
    }

    /**
     * Gets the first element of the queue
     * @return value of element at the position
     */
    @Override
    public E peek() {
        return elems.get(0);
    }
}
