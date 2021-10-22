package agh.ii.prinjava.proj1.impl;
/**
 * The objective is to implement a double linked list
 * @param <E>, the elements that we store in double linked list are of different types
 */
public class DLinkList<E> {

    private Node<E> head;

    /**
     * The objective of this method is to add a new node at the beginning of the list
     * We check the case where the list is empty, and we modify the pointing attributes
     * To have the New node as the head of the list
     */
    public void addFirst(E elem) {
        if (head == null) {
            head = new Node<>(elem, null, null);
        }

        else {
            Node<E> n = head;
            head = new Node<>(elem, null, n);
            n.prev = head;
        }
    }

    /**
     * The objective of this method is to add a new node at the end of the list
     * We check the case where the list is empty
     * To have the New node at the end, we go through the list until the null element
     * And we assign it as the new Node
     */
    public void addLast(E elem) {

        if (head == null) {
            head = new Node<>(elem, null, null);
        }

        else {
            Node<E> n = head;

            while (n.next != null) {
                n = n.next;
            }

            n.next = new Node<>(elem, n, null);
        }
    }

    /**
     * The objective of this method is to remove the node at the top of the list
     * if the list is empty, we cannot remove, and we throw exception
     * Then we use the head node, and we modify the references to the previous and next element to the list
     * @return the first element of the list
     */
    public E removeFirst() {

        if (this.head == null)
            throw new IllegalStateException("The list is empty");

        Node<E> n = head;
        head = head.next;

        n.next = null;

        if (head != null)
            head.prev = null;

        return n.elem;
    }

    /**
     * The objective of this method is to remove the node at the end of the list
     * if the list is empty, we cannot remove, and we throw exception
     * Then we use the head node, we create 2 nodes related to the head
     * This will allow us to erase the previous and next pointers of the last node in an easier way
     * And we modify the references to the previous and next element to the list
     * @return the last element of the list
     */
    public E removeLast() {

        if (head == null) {
            throw new IllegalStateException("The list is empty");
        }

        Node<E> n = head;
        Node<E> p = head;

        while (n.next != null) {
            p = n;
            n = n.next;
        }

        E elem = n.elem;

        p.next = null;
        n.prev = null;

        return elem;
    }

    /**
     * this function allows finding the element at a given index, and will be use in the "peek"
     * for Queue :
     * @see MyQueueDLLBImpl#peek()
     * for Stack :
     * @see MyStackDLLBImpl#peek()
     * @return the element at the given index
     * @param i , which is the index
     * */
    public E get(int i) {
        if (getSize() <= i) {
            throw new IllegalStateException("The index is out of bound");
        }

        else {
            int count = 0;
            Node<E> n = head;

            while(n != null && count < i) {
                n = n.next;
                count++;
            }

            return n.elem;
        }
    }

    /**
     * this function allows going through the Dlinklist and find the size of it, and will be use in the "numOfElems"
     * for Queue :
     * @see MyQueueDLLBImpl#numOfElems()
     * for Stack :
     * @see MyStackDLLBImpl#numOfElems()
     * @return the size
     * */
    public int getSize() {

        if (this.head == null) return 0;

        int size = 0;

        for (Node<E> n = head; n != null; n = n.next)
            size++;

        return size;
    }

    /**
     * This method return the values of the attributes
     * @return a string containing all information
     */
    @Override
    public String toString() {
        return "DLinkList{" +
                "head=" + head +
                '}';
    }

    /**
     * We create a nested class Node
     * It will allow us to build our linked list and its constructor
     * The first element allow to store a value of any type
     * The second one allow to have a reference to the previous node
     * The third element allow to have a reference to the next node
     * @param <T> Node which store element of any types
     */
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem, Node<T> prev, Node<T> next) {
            this.elem = elem;
            this.prev = prev;
            this.next = next;
        }
    }
}
