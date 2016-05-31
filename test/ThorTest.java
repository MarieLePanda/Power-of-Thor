/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class ThorTest {
    
    public static Landscape landscape;
    public ThorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Initialization of lightning and Thor possition. Plus landscape
     */
    @Before
    public void setUp() {
        int ligthningX = 10;
        int ligthningY = 16;
        
        Case[][] plateau = new Case[40][18];
        for(int x = 0; x < 40; x++){
            for(int y = 0; y < 18; y++){
                Case newCase;
                if(x == ligthningX && y == ligthningY){
                    newCase = new Case(x, y, true);
                }else{
                    newCase = new Case(x, y, false);
                }
                plateau[x][y] = newCase;
            }
        }
        landscape = new Landscape(plateau);    
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updatePossition method, of class Thor.
     */
    @Test
    public void testUpdatePossitionNorth() {
        int thorX = 12;
        int thorY = 6;

        Thor instance = new Thor(thorX, thorY, landscape);
        int expResultX = 12;
        int expResultY = 5;
        instance.updatePossition("N");
        int resultX = instance.x;
        int resultY = instance.y;
        assertEquals(expResultX, resultX);
        assertEquals(expResultY, resultY);
    }
       
    /**
     * Test of updatePossition method, of class Thor.
     */
    @Test
    public void testUpdatePossitionSouth() {
        int thorX = 12;
        int thorY = 6;

        Thor instance = new Thor(thorX, thorY, landscape);
        int expResultX = 12;
        int expResultY = 7;
        instance.updatePossition("S");
        int resultX = instance.x;
        int resultY = instance.y;
        assertEquals(expResultX, resultX);
        assertEquals(expResultY, resultY);
    }

     /**
     * Test of updatePossition method, of class Thor.
     */
    @Test
    public void testUpdatePossitionWest() {
        int thorX = 12;
        int thorY = 6;

        Thor instance = new Thor(thorX, thorY, landscape);
        int expResultX = 13;
        int expResultY = 6;
        instance.updatePossition("W");
        int resultX = instance.x;
        int resultY = instance.y;
        assertEquals(expResultX, resultX);
        assertEquals(expResultY, resultY);
    }

     /**
     * Test of updatePossition method, of class Thor.
     */
    @Test
    public void testUpdatePossitionEast() {
        int thorX = 12;
        int thorY = 6;

        Thor instance = new Thor(thorX, thorY, landscape);
        int expResultX = 11;
        int expResultY = 6;
        instance.updatePossition("E");
        int resultX = instance.x;
        int resultY = instance.y;
        assertEquals(expResultX, resultX);
        assertEquals(expResultY, resultY);
    }

     /**
     * Test of updatePossition method, of class Thor.
     */
    @Test
    public void testUpdatePossitionNorthEast() {
        int thorX = 12;
        int thorY = 6;

        Thor instance = new Thor(thorX, thorY, landscape);
        int expResultX = 11;
        int expResultY = 5;
        instance.updatePossition("NE");
        int resultX = instance.x;
        int resultY = instance.y;
        assertEquals(expResultX, resultX);
        assertEquals(expResultY, resultY);
    }

     /**
     * Test of updatePossition method, of class Thor.
     */
    @Test
    public void testUpdatePossitionNorthWest() {
        int thorX = 12;
        int thorY = 6;

        Thor instance = new Thor(thorX, thorY, landscape);
        int expResultX = 13;
        int expResultY = 5;
        instance.updatePossition("NW");
        int resultX = instance.x;
        int resultY = instance.y;
        assertEquals(expResultX, resultX);
        assertEquals(expResultY, resultY);
    }

     /**
     * Test of updatePossition method, of class Thor.
     */
    @Test
    public void testUpdatePossitionSouthhWest() {
        int thorX = 12;
        int thorY = 6;

        Thor instance = new Thor(thorX, thorY, landscape);
        int expResultX = 13;
        int expResultY = 7;
        instance.updatePossition("SW");
        int resultX = instance.x;
        int resultY = instance.y;
        assertEquals(expResultX, resultX);
        assertEquals(expResultY, resultY);
    }

    /**
     * Test of updatePossition method, of class Thor.
     */
    @Test
    public void testUpdatePossitionSouthhEast() {
        int thorX = 12;
        int thorY = 6;

        Thor instance = new Thor(thorX, thorY, landscape);
        int expResultX = 11;
        int expResultY = 7;
        instance.updatePossition("SE");
        int resultX = instance.x;
        int resultY = instance.y;
        assertEquals(expResultX, resultX);
        assertEquals(expResultY, resultY);
    }
    
    /**
     * Test of directionOfCase method, of class Thor.
     */
    @Test
    public void testDirectionOfCaseNorthWest() {
        int thorX = 12;
        int thorY = 6;

        Case possition1 = landscape.plateau[13][7];
        Case possition2 = landscape.plateau[15][17];
        Case possition3 = landscape.plateau[30][12];

        Thor instance = new Thor(thorX, thorY, landscape);
        String expResult = "NW";
        String result = instance.directionOfCase(possition1);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition2);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition3);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of directionOfCase method, of class Thor.
     */
    @Test
    public void testDirectionOfCaseNorthEast() {
        int thorX = 12;
        int thorY = 6;

        Case possition1 = landscape.plateau[11][7];
        Case possition2 = landscape.plateau[1][17];
        Case possition3 = landscape.plateau[2][16];

        Thor instance = new Thor(thorX, thorY, landscape);
        String expResult = "NE";
        String result = instance.directionOfCase(possition1);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition2);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition3);
        assertEquals(expResult, result);
    }
        
    /**
     * Test of directionOfCase method, of class Thor.
     */
    @Test
    public void testDirectionOfCaseNorth() {
        int thorX = 12;
        int thorY = 6;

        Case possition1 = landscape.plateau[12][7];
        Case possition2 = landscape.plateau[12][17];
        Case possition3 = landscape.plateau[12][12];

        Thor instance = new Thor(thorX, thorY, landscape);
        String expResult = "N";
        String result = instance.directionOfCase(possition1);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition2);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition3);
        assertEquals(expResult, result);
    }

    /**
     * Test of directionOfCase method, of class Thor.
     */
    @Test
    public void testDirectionOfCaseSouthWest() {
        int thorX = 12;
        int thorY = 6;

        Case possition1 = landscape.plateau[16][5];
        Case possition2 = landscape.plateau[13][2];
        Case possition3 = landscape.plateau[39][0];

        Thor instance = new Thor(thorX, thorY, landscape);
        String expResult = "SW";
        String result = instance.directionOfCase(possition1);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition2);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition3);
        assertEquals(expResult, result);
    }

    /**
     * Test of directionOfCase method, of class Thor.
     */
    @Test
    public void testDirectionOfCaseSouthEast() {
        int thorX = 12;
        int thorY = 6;

        Case possition1 = landscape.plateau[11][5];
        Case possition2 = landscape.plateau[1][2];
        Case possition3 = landscape.plateau[0][0];

        Thor instance = new Thor(thorX, thorY, landscape);
        String expResult = "SE";
        String result = instance.directionOfCase(possition1);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition2);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition3);
        assertEquals(expResult, result);
    }

    /**
     * Test of directionOfCase method, of class Thor.
     */
    @Test
    public void testDirectionOfCaseSouth() {
        int thorX = 12;
        int thorY = 6;

        Case possition1 = landscape.plateau[12][5];
        Case possition2 = landscape.plateau[12][2];
        Case possition3 = landscape.plateau[12][1];

        Thor instance = new Thor(thorX, thorY, landscape);
        String expResult = "S";
        String result = instance.directionOfCase(possition1);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition2);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition3);
        assertEquals(expResult, result);
    }

    /**
     * Test of directionOfCase method, of class Thor.
     */
    @Test
    public void testDirectionOfCaseEast() {
        int thorX = 12;
        int thorY = 6;

        Case possition1 = landscape.plateau[11][6];
        Case possition2 = landscape.plateau[0][6];
        Case possition3 = landscape.plateau[9][6];

        Thor instance = new Thor(thorX, thorY, landscape);
        String expResult = "E";
        String result = instance.directionOfCase(possition1);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition2);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition3);
        assertEquals(expResult, result);
    }

    /**
     * Test of directionOfCase method, of class Thor.
     */
    @Test
    public void testDirectionOfCaseWest() {
        int thorX = 12;
        int thorY = 6;

        Case possition1 = landscape.plateau[13][6];
        Case possition2 = landscape.plateau[14][6];
        Case possition3 = landscape.plateau[16][6];

        Thor instance = new Thor(thorX, thorY, landscape);
        String expResult = "W";
        String result = instance.directionOfCase(possition1);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition2);
        assertEquals(expResult, result);
        result = instance.directionOfCase(possition3);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNorth method, of class Thor.
     */
    @Test
    public void testFindNorthWhenIsNorth() {
        int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[12][7];
        Case possition2 = landscape.plateau[13][17];
        Case possition3 = landscape.plateau[0][12];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = true;
        boolean result = instance.isNorth(possition1);
        assertEquals(expResult, result);
        result = instance.isNorth(possition2);
        assertEquals(expResult, result);
        result = instance.isNorth(possition3);
        assertEquals(expResult, result);    
    }

     /**
     * Test of isNorth method, of class Thor.
     */
    @Test
    public void testFindNorthEastWhenIsNorthEast() {
        int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[12][6];
        Case possition2 = landscape.plateau[13][1];
        Case possition3 = landscape.plateau[0][5];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = false;
        boolean result = instance.isNorth(possition1);
        assertEquals(expResult, result);
        result = instance.isNorth(possition2);
        assertEquals(expResult, result);
        result = instance.isNorth(possition3);
        assertEquals(expResult, result);    
    }

    
    /**
     * Test of isNorth method, of class Thor.
     */
    @Test
    public void testDontFindNorthWhenIsNotNorth() {
        int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[12][6];
        Case possition2 = landscape.plateau[12][1];
        Case possition3 = landscape.plateau[12][5];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = false;
        boolean result = instance.isNorth(possition1);
        assertEquals(expResult, result);
        result = instance.isNorth(possition2);
        assertEquals(expResult, result);
        result = instance.isNorth(possition3);
        assertEquals(expResult, result);    
    }

    /**
     * Test of isSouth method, of class Thor.
     */
    @Test
    public void testFindSouthWhereIsSouth() {
        int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[12][5];
        Case possition2 = landscape.plateau[12][2];
        Case possition3 = landscape.plateau[12][1];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = true;
        boolean result = instance.isSouth(possition1);
        assertEquals(expResult, result);
        result = instance.isSouth(possition2);
        assertEquals(expResult, result);
        result = instance.isSouth(possition3);
        assertEquals(expResult, result);    
    }

        /**
     * Test of isSouth method, of class Thor.
     */
    @Test
    public void testDontFindSouthWhereIsNotSouth() {
        int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[12][6];
        Case possition2 = landscape.plateau[12][12];
        Case possition3 = landscape.plateau[12][7];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = false;
        boolean result = instance.isSouth(possition1);
        assertEquals(expResult, result);
        result = instance.isSouth(possition2);
        assertEquals(expResult, result);
        result = instance.isSouth(possition3);
        assertEquals(expResult, result);    
    }

    /**
     * Test of isWest method, of class Thor.
     */
    @Test
    public void testFindWestWhenIsWest() {
        int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[15][6];
        Case possition2 = landscape.plateau[13][6];
        Case possition3 = landscape.plateau[39][6];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = true;
        boolean result = instance.isWest(possition1);
        assertEquals(expResult, result);
        result = instance.isWest(possition2);
        assertEquals(expResult, result);
        result = instance.isWest(possition3);
        assertEquals(expResult, result);    
    }
    /**
     * Test of isWest method, of class Thor.
     */
    @Test
    public void testDontFindWestWhenIsNotWest() {
        int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[12][6];
        Case possition2 = landscape.plateau[11][6];
        Case possition3 = landscape.plateau[0][6];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = false;
        boolean result = instance.isWest(possition1);
        assertEquals(expResult, result);
        result = instance.isWest(possition2);
        assertEquals(expResult, result);
        result = instance.isWest(possition3);
        assertEquals(expResult, result);    
    }

    /**
     * Test of isEast method, of class Thor.
     */
    @Test
    public void testFindEastWhenIsEast() {
       int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[11][6];
        Case possition2 = landscape.plateau[0][6];
        Case possition3 = landscape.plateau[9][6];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = true;
        boolean result = instance.isEast(possition1);
        assertEquals(expResult, result);
        result = instance.isEast(possition2);
        assertEquals(expResult, result);
        result = instance.isEast(possition3);
        assertEquals(expResult, result);    
    }

    /**
     * Test of isEast method, of class Thor.
     */
    @Test
    public void testDontFindEastWhenIsNotEast() {
       int thorX = 12;
        int thorY = 6;
        Case possition1 = landscape.plateau[12][6];
        Case possition2 = landscape.plateau[16][6];
        Case possition3 = landscape.plateau[13][6];

        Thor instance = new Thor(thorX, thorY, landscape);
        boolean expResult = false;
        boolean result = instance.isEast(possition1);
        assertEquals(expResult, result);
        result = instance.isEast(possition2);
        assertEquals(expResult, result);
        result = instance.isEast(possition3);
        assertEquals(expResult, result);    
    }
    
}
