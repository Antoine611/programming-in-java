package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test to verify if the function "enqueue" works correctly
     * @see MyQueueDLLBImpl#enqueue(Object)
     * To do so, we use the function to add some elements in the queue
     * And we remove an element with "dequeue" and assertEquals to verify if the element was correctly added
     * And if it respects the implementation of the queue
     * @see MyQueueDLLBImpl#dequeue()
     * */
    @Test
    void enqueue() {
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(17);
        assertEquals(5, queueOfInts.dequeue());
    }

    /**
     * Test to verify if the function "dequeue" works correctly
     * @see MyQueueDLLBImpl#dequeue()
     * To do so, we use the function "enqueue" to add an element in the queue
     * @see MyQueueDLLBImpl#enqueue(Object)
     * But here, we intanciate a random number which will be enqueue
     * And we remove it with "dequeue" and assertEquals to verify if the function works correctly
     * And if it respects the implementation of the queue
     * */
    @Test
    void dequeue() {
        Random r = new Random();

        for (int i = 0; i < Math.abs(r.nextInt(100)); i++) {
            int z = r.nextInt();
            queueOfInts.enqueue(z);
            assertEquals(z, queueOfInts.dequeue());
        }
    }

    /**
     * Test to verify if the function "numOfElems" works correctly
     * @see MyQueueDLLBImpl#numOfElems()
     * To do so, we use the function "enqueue" to add some elements in the queue
     * @see MyQueueDLLBImpl#enqueue(Object)
     * And we verify with the function "numOfElems" and assertEquals if the function works correctly
     * By giving the good number of elements.
     * */
    @Test
    void numOfElems() {
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(6);
        queueOfInts.enqueue(94);
        queueOfInts.enqueue(24);
        assertEquals(4, queueOfInts.dequeue());
    }

    /**
     * Test to verify if the function "peek" works correctly
     * @see MyQueueDLLBImpl#peek()
     * To do so, we use the function "enqueue" to add some elements in the queue
     * @see MyQueueDLLBImpl#enqueue(Object)
     * And we peek it ones with "peek" and assertEquals to verify if the function works correctly
     * */
    @Test
    void peek() {
        queueOfInts.enqueue(74);
        queueOfInts.enqueue(14);
        queueOfInts.enqueue(67);
        assertEquals(74, queueOfInts.peek());
    }
}