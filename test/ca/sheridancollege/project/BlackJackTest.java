package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asim, Devansh, Nadir
 */
public class BlackJackTest {

    public BlackJackTest() {
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
    public void goodTestCheckWinner() {
        System.out.println("checkWinner");
        Player player = new Player("name");
        boolean expResult = true;
        boolean result = BlackJack.checkWinner(player);
        assertEquals(expResult, result);
    }

    @Test
    public void badTestCheckWinner() {
        System.out.println("checkWinner");
        Player player = new Player("kjasfksadfsadf");
        boolean expResult = false;
        boolean result = BlackJack.checkWinner(player);
        assertEquals(expResult, result);
    }

    @Test
    public void boundaryCheckWinner() {
        System.out.println("checkWinner");
        Player player = new Player("name");
        boolean expResult = true;
        boolean result = BlackJack.checkWinner(player);
        assertEquals(expResult, result);
    }

    @Test
    public void goodTestStartRound() {
        System.out.println("startRound");
        Player player = new Player("name");
        boolean expResult = true;
        boolean result = BlackJack.startRound(player);
        assertEquals(expResult, result);
    }

    @Test
    public void badTestStartRound() {
        System.out.println("startRound");
        Player player = null;
        boolean expResult = false;
        boolean result = BlackJack.startRound(player);
        assertEquals(expResult, result);
    }

    @Test
    public void boundaryTestStartRound() {
        System.out.println("startRound");
        Player player = new Player("name");
        boolean expResult = true;
        boolean result = BlackJack.startRound(player);
        assertEquals(expResult, result);
    }

}
