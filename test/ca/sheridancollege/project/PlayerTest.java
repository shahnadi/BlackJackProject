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
 * @author aksal
 */
public class PlayerTest {
    
    public PlayerTest() {
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

    

    @Test
    public void testGetPlayerIDGood() {
        System.out.println("getPlayerID");
        Player instance = new Player("nadir");
        String expResult = "nadir";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetPlayerIDBad() {
        System.out.println("getPlayerID");
        Player instance = new Player(" ");
        String expResult = " ";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testGetPlayerIDBoundary() {
        System.out.println("getPlayerID");
        Player instance = new Player("s");
        String expResult = "s";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        
    }

   

   


    @Test
    public void testShowOneCard() {
        System.out.println("showOneCard");
        Player instance = new Player("asim");
        instance.showOneCard();
        
    }
//
//    @Test
//    public void testShowCards() {
//        System.out.println("showCards");
//        Player instance = null;
//        instance.showCards();
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testBeginGame() {
//        System.out.println("beginGame");
//        Player instance = null;
//        instance.beginGame();
//        fail("The test case is a prototype.");
//    }
//    
}
