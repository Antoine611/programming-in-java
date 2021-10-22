package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    /**
     * Here we Instantiate a Double linked list as a Stack
     * This is the constructor of the Stack
     */
    public MyStackDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /**
     * The objective of this method is to remove node in top position of stack.
     * It uses the "removeLast" method
     * @see DLinkList#removeLast()
     * @return value of the removed node
     */
    @Override
    public E pop() {
        return elems.removeLast();
    }

    /**
     * The objective of this method is to add a new node to top position of the stack.
     * It uses the "addLast method"
     * @see DLinkList#addLast(Object)
     * @param x : @param x : Node to add to first position
     */
    @Override
    public void push(E x) {
        elems.addLast(x);
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
     * Gets the element at the top position of Stack.
     * @return value of element at the position
     */
    @Override
    public E peek() {
        return elems.get(numOfElems()-1);
    }
}
