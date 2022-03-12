package org.jling.megaport.MegaportSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int count = 0;
        //Count number of arguments
        for(String s: args) {
        	count++;
        }
        
        // If there are no arguments, file used should be a demo file.
        if(count == 0) {
        	
        // For more than one, sort algorithm can be chosen multiple arguments, sorting will occur for each file destination.
        }else if (count > 1) {
        
        	
        //for one, default sort algorithm will be used.
        }else {
        	
        }
        
        
        
        
    }
}
