package org.jling.megaport.MegaportSort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int count = 0;
        ListObject listobj ;
        //Count number of arguments
        for(String s: args) {
        	count++;
        }
        
        // If there are no arguments, file used should be a demo file.
        if(count == 0) {
        	listobj= ListObjectReader("src/main/resources/DemoFile1.txt");
        	//System.out.println(listobj.toString());
        	
        	
        // For more than one, sort algorithm can be chosen multiple arguments, sorting will occur for each file destination.
        }else if (count > 1) {
        
        	
        //for one, default sort algorithm will be used.
        }else {
        	
        }
        
        
    }
    
    public static ListObject ListObjectReader(String directory) {
    	
    	ListObject toReturn = new ListObject();
    	BufferedReader reader= null;
    	try {
    		String readline;
    		File f = new File(directory);
    		FileReader fileIn = new FileReader(f);
    		reader = new BufferedReader(fileIn);
    		while((readline =reader.readLine()) != null) {
    			toReturn.Add(readline);
    		}
    	
    	}catch(Exception e) {
    	
    		e.printStackTrace();
    	} finally {
    		 try {
    			    if (reader != null)
    			     reader.close();
    			   } catch (Exception ex) {
    			    ex.printStackTrace();
    			   }
    	}
    	
    	
		return toReturn;
    	
    }
    
    
}
