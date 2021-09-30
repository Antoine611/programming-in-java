package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArrayBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.ARRAY_B);

    @BeforeEach
    void setUp() {
        stackOfInts.push(1);
        stackOfInts.push(16);
        stackOfInts.push(12);
        stackOfInts.push(169);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void newStackIsEmpty() {

    }

    @Test
    void pop() {
        assertEquals(169, stackOfInts.pop());
        assertEquals(12, stackOfInts.pop());
        assertNotEquals(182, stackOfInts.pop());
        assertEquals(1, stackOfInts.pop());
    }

    @Test
    void push() {
        Random random = new Random();

        for (int i = 0; i < random.nextInt(); i++) {
            int next = random.nextInt();

            System.out.println(next);

            stackOfInts.push(next);

            assertEquals(next, stackOfInts.pop());
        }
    }

    @Test
    void numOfElems() {
    }

    @Test
    void peek() {
        assertEquals(1, stackOfInts.peek());
        assertEquals(16, stackOfInts.peek());
        assertEquals(12, stackOfInts.peek());
        assertNotEquals(19383, stackOfInts.peek());
    }
}