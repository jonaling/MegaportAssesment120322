package org.jling.megaport.MegaportSort;

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
    
    //test response for no file
    public void NoFileTest() {
    	
    }
    
    //test response for demo file using collection sort
    public void DemoFileCollectionSort() {
    	
    }
    
    //test response for demo file using quick-sort
    public void DemoFileQuickSort() {
    	
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
        assertTrue( true );
    }
}
