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
public class LandscapeTest {
    
    private static Landscape landscape;
    
    public LandscapeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of possitionofLightning method, of class Landscape.
     */
    @Test
    public void testPossitionofLightning() {
        System.out.println("possitionofLightning");
        Case expResult = landscape.plateau[10][16];
        Case result = landscape.possitionofLightning();
        assertEquals(expResult, result);
    }
    
}
