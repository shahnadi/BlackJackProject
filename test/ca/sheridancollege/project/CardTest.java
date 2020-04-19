/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asra
 */
public class CardTest {

    public CardTest() {
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
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        Card instance = new Card(1);
        instance.setValue(value);

    }

    /**
     * Test of getValue method, of class Card.
     */

//
//    /**
//     * Test of getNum method, of class Card.
//     */
    @Test
    public void testGetNum() {
        System.out.println("getNum");
        Card instance = new Card(4);
        int expResult = 4;
        int result = instance.getNum();
        assertEquals(expResult, result);

    }
//
//    /**
//     * Test of setNum method, of class Card.
//     */
//    @Test
    public void testSetNum() {
        System.out.println("setNum");
        int num = 0;
        Card instance = new Card(4);
        instance.setNum(num);
       
    }
//
//    /**
//     * Test of checkVal method, of class Card.
//     */
    @Test
    public void testCheckVal() {
        System.out.println("checkVal");
        Card instance = new Card(4);
        instance.checkVal();
    }
//
//    /**
//     * Test of ifAce method, of class Card.
//     */
    @Test
    public void testIfAce() {
        System.out.println("ifAce");
        Card instance =  new Card(4);
        instance.ifAce();
       
    }
    

}
