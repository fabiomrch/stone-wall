package com.stonewall;

import com.stonewall.algorithm.MinBlocksNumberCalculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	int H[] = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        assertEquals(7, MinBlocksNumberCalculator.solution(H));
    }
}
