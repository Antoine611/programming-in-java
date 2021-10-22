package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test to verify if the function "addFirst" works correctly
     * @see DLinkList#addFirst(Object)
     * To do so, we use the function to add element in the list
     * And we remove it with "removeFirst" and assertEquals to verify if the element was correctly added in the list
     * @see DLinkList#removeFirst()
     * We verify also if the function "get" throw the error when we add the element
     * */
    @Test
    void addFirst() {
        dLinkList.addFirst(40);
        assertEquals(40, dLinkList.removeFirst());
        assertThrows(IllegalStateException.class, () -> dLinkList.get(12));
    }

    /**
     * Test to verify if the function "addLast" works correctly
     * @see DLinkList#addLast(Object)
     * To do so, we use the function to add element in the list
     * And we remove it with "removeLast" and assertEquals to verify if the element was correctly added in the list
     * @see DLinkList#removeLast()
     * */
    @Test
    void addLast() {
        dLinkList.addLast(40);
         assertEquals(40, dLinkList.removeLast());
    }

    /**
     * Test to verify if the function "removeFirst" works correctly
     * @see DLinkList#removeFirst()
     * To do so, we use the function "addFirst" to add an element in the list
     * @see DLinkList#addFirst(Object)
     * And we remove it with "removeFirst" and assertEquals to verify if the function works correctly
     * */
    @Test
    void removeFirst() {
        dLinkList.addFirst(12);
        assertEquals(12, dLinkList.removeFirst());
    }

    /**
     * Test to verify if the function "removeLast" works correctly
     * @see DLinkList#removeLast()
     * To do so, we use the function "addLast" to add an element in the list
     * @see DLinkList#addLast(Object)
     * And we remove it with "removeLast" and assertEquals to verify if the function works correctly
     * */
    @Test
    void removeLast() {
        dLinkList.addLast(30);
        assertEquals(30, dLinkList.removeLast());
    }

    /**
     * Test to verify if the function "get" works correctly
     * @see DLinkList#get(int)
     * To do so, we use the function "addLast" to add an element in the list
     * @see DLinkList#addLast(Object)
     * And we use the function "get" and assertEquals with an integer as parameter
     * Which that is an index of an element which exist in the list to verify if the function works correctly
     * */
    @Test
    void get() {
        dLinkList.addLast(30);
        assertEquals(30, dLinkList.get(0));
    }

    /**
     * Test to verify if the function "getSize" works correctly
     * @see DLinkList#getSize()
     * To do so, we use the function "addLast" to add an element in the list
     * @see DLinkList#addLast(Object)
     * And we use the function "getSize" and assertEquals to collect the number of elements
     * */
    @Test
    void getSize() {
        dLinkList.addLast(30);
        dLinkList.addLast(31);
        dLinkList.addLast(32);
        dLinkList.addLast(33);
        assertEquals(4, dLinkList.getSize());
    }
}