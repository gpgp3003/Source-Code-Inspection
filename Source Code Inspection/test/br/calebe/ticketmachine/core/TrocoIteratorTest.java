/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gian Piero
 */
public class TrocoIteratorTest {
    
    public TrocoIteratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hasNext method, of class TrocoIterator.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        TrocoIterator instance = null;
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class TrocoIterator.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        TrocoIterator instance = null;
        PapelMoeda expResult = null;
        PapelMoeda result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class TrocoIterator.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        TrocoIterator instance = null;
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
