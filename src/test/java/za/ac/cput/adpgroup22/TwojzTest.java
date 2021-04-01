/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpgroup22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author ismaaeel Karriem
 */
public class TwojzTest {
   private Twojz a;
   private Twojz b;
   private Twojz c;
   
    public TwojzTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @BeforeEach
    void setUp(){
    a = new Twojz();
    b = new Twojz();
    c = b;
    }
    //Identity test
    @Test
    void testIdentity(){
        
        assertSame(a,a);
    }
    //Equality test
    @Test
    void testEquality(){
        
       assertEquals(a,c); 
    }
    //Timeout test
   @Test (timeout=5)
    void testTimeout(){
        while(true);
    }
    //Failing test
    @Test
    void testFail(){
        testFail();
    }
    //Disable test
    @Test
    @Disabled("this test has been disabled")
    void testDisabled(){
       testDisabled();
    }
}
   
    
    

