package edu.umd.enpm.assignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataSetTest {
	private DataSet ds1, ds2,ds3;
	
	@BeforeEach
	void setUp() {
    	ds1=new DataSet();
    	ds2=new DataSet();
    	ds3=new DataSet();
    	
    	//Added Elements into the DataSet
    	ds1.addPoint(new DataPoint(3,2));
    	ds2.addPoint(new DataPoint(3,2));
    	ds3.addPoint(new DataPoint(5,5));
    	ds3.addPoint(new DataPoint(6,6));

    }

    @AfterEach
    void tearDown() {
    	ds1=null;
    	ds2=null;
    	ds3=null;
    }
    
    @Test
    void testEquals() {
    	// Testing with Similar Objects
    	assertEquals(ds1.equals(ds2), ds2.equals(ds1));
    	
    	// Checking with Same object
    	assertTrue(ds1.equals(ds1));
    	
    	// Checking with null
    	assertFalse(ds1.equals(null));
    	
    	// Checking with a different object
    	assertFalse(ds1.equals(ds3));
    }

    @Test
    void testHashCode() {
    	assertEquals(ds1.hashCode(), ds2.hashCode());
    	assertFalse(ds1.hashCode()==ds3.hashCode());
    }
    
    @Test
    void testgetDataPoints() {
    	assertEquals(ds1.getDataPoints(), ds2.getDataPoints());
    }
    
    @Test
    void testSubsumes() {
    	DataSet ds4=new DataSet();
    	
    	ds4.addPoint(new DataPoint(3,4));
    	
    	assertFalse(ds1.subsumes(ds4));
    	assertTrue(ds1.subsumes(ds2));
    	assertFalse(ds1.subsumes(ds3));
    	
    	ds4=null;
    	
    }

    @Test
    void testToString() {
    	assertEquals("3, 2", ds1.toString());
    }
}