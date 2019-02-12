package org.fibonacci.core;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FibonacciTest extends TestCase{
	/**
	 * Precision accepted for the different tests
	 */
	private static double EPSILON = 1e-12;
	
    /**
     * Create the test case
     * @param testName name of the test case
     */
    public FibonacciTest(String testName){
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite(FibonacciTest.class);
    }

    /**
     * Get always the same instance of Fibonacci core
     */
    public void testGet(){
    	Fibonacci fb1 = Fibonacci.get();
        Fibonacci fb2 = Fibonacci.get();
        Assert.assertEquals(fb1, fb2);     
    }
    
    /**
     * Run the algorithm to compute the Fibonacci sequence
     */
    public void testRun(){
    	Fibonacci fb = Fibonacci.get();
    	Assert.assertEquals(0, fb.run(-1), FibonacciTest.EPSILON);
    	Assert.assertEquals(0, fb.run(0), FibonacciTest.EPSILON);
    	Assert.assertEquals(1, fb.run(1), FibonacciTest.EPSILON);
    	Assert.assertEquals(2, fb.run(3), FibonacciTest.EPSILON);
    	Assert.assertEquals(13, fb.run(7), FibonacciTest.EPSILON);
    }
}
