package edu.umd.enpm.assignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataPointTest {
	private DataPoint dp1, dp2, dp3;
    @BeforeEach
    void setUp() {
    	dp1=new DataPoint(2,3); 
    	dp2=new DataPoint(2,3);
    	dp3=new DataPoint(4,4);
    }

    @AfterEach
    void tearDown() {
    	dp1=null;
    	dp2=null;
    	dp3=null;
    }
    
    @Test
    
    void testGettersSetters() {
    	
    	// Setters 
    	dp3.setXValue(56);
    	dp3.setValue(78);
    	//Testing setters with Getter
    	assertEquals(56, dp3.getXValue());
    	assertEquals(78, dp3.getYValue());
    	
    }
    @Test
    void testEquals() {
    	// Checking with similar objects
    	assertTrue(dp1.equals(dp2));
    	assertTrue(dp1.equals(dp1));
    	
    	// Checking null
    	assertFalse(dp1.equals(null));
    	
    	// Checking with a different object
    	assertFalse(dp1.equals(dp3));
    }

    @Test
    void testHashCode() {
    	//Checking with similar object
    	assertEquals(dp1.hashCode(), dp2.hashCode());
    	
    	// Checking with different object
    	assertFalse(dp1.hashCode()==dp3.hashCode());
    }

    @Test
    void testToString() {
    	assertEquals("2, 3", dp1.toString());
    }
}