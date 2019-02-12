package org.fibonacci.plugin;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GreetingMojoTest extends TestCase{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GreetingMojoTest(String testName){
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite(GreetingMojoTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        assertTrue(true);
    }
}
