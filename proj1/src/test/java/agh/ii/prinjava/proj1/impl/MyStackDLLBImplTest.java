package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown(){
    }

    /**
     * Test to verify if the function "pop" works correctly
     * @see MyStackDLLBImpl#pop()
     * To do so, we use the function "push" to add an element in the stack
     * @see MyStackDLLBImpl#push(Object)
     * But here, we intanciate a random number which will be push
     * And we remove this element and use assertEquals to verify if the element was correctly removed from the stack
     * And if it respects the implementation of the stack
     * */
    @Test
    void pop() {
        //assertEquals(int expected,int actual); pour vérifier les résultats
        //assertThrows(IllegalStateException.class, stack::pop)
        Random r = new Random();

        for (int i = 0; i < Math.abs(r.nextInt(100)); i++) {
            int z = r.nextInt();
            stackOfInts.push(z);
            assertEquals(z, stackOfInts.pop());
        }
    }

    /**
     * Test to verify if the function "push" works correctly
     * @see MyStackDLLBImpl#push(Object)
     * To do so, we use this function to add an element in the stack
     * And we verify with the function "peek" and assertEquals to verify if the element was correctly added in the stack
     * And if it respectq the implementation of the stack
     * @see MyStackDLLBImpl#peek()
     * */
    @Test
    void push() {
        stackOfInts.push(48);
        stackOfInts.peek();
    }

    /**
     * Test to verify if the function "numOfElems" works correctly
     * @see MyStackDLLBImpl#numOfElems()
     * To do so, we use the function "push" to add some elements in the stack
     * @see MyStackDLLBImpl#push(Object)
     * And we verify with the function "numOfElems" and assertEquals if the function works correctly
     * By giving the good number of elements
     * */
    @Test
    void numOfElems() {
        stackOfInts.push(4);
        stackOfInts.push(6);
        stackOfInts.push(94);
        stackOfInts.push(24);
        stackOfInts.push(34);
        assertEquals(5, stackOfInts.numOfElems());
    }

    /**
     * Test to verify if the function "peek" works correctly
     * @see MyStackDLLBImpl#peek()
     * To do so, we use the function "push" to add some elements in the stack
     * @see MyStackDLLBImpl#push(Object)
     * And we peek it ones with "peek" and assertEquals to verify if the function works correctly
     * */
    @Test
    void peek() {
        stackOfInts.push(24);
        stackOfInts.push(37);
        assertEquals(37, stackOfInts.peek());
    }
}