package org.jling.megaport.MegaportSort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.jling.megaport.MegaportSort.SortingInterfaces.SortingAlgorithm;
import org.jling.megaport.MegaportSort.SortingInterfaces.SortingFactory;


public class App 
{
    public static void main( String[] args )
    {
        int count = 0;
        ListObject listobj;
        String filename;
        SortingAlgorithm sortAlgo;
        SortingFactory factory;
        //Count number of arguments
        for(String s: args) {
        	count++;
        }
        
        // If there are no arguments, file used should be a demo file.
        if(count == 0) {
        	listobj= ListObjectReader("src/main/resources/DemoFile1.txt");
        	filename = GetFileName("src/main/resources/DemoFile1.txt") + "-sorted.txt";
        	factory = new SortingFactory();
        	sortAlgo = factory.CreateSortAlgorithm("");
        	
        	listobj=sortAlgo.Sort(listobj);
        	//System.out.println(listobj.toString());
        	ListObjectPrinter(listobj,filename);
        	
        	
        // For more than one, sort algorithm can be chosen multiple arguments, sorting will occur for each file destination.
        }else if (count > 1) {
        	String algo = args[0];
        	for (int i = 1; i< count; i++ ) {
        		listobj= ListObjectReader(args[i]);
        		filename = GetFileName(args[i])+"-sorted.txt";
            	
            	//System.out.println(listobj.toString());
            	ListObjectPrinter(listobj,filename);
        		
        	}
        	
        //for one, default sort algorithm will be used.
        }else {
        	listobj= ListObjectReader(args[0]);
        	filename = GetFileName(args[0])+"-sorted.txt";
        	
        	//System.out.println(listobj.toString());
        	ListObjectPrinter(listobj,filename);
        }
        
        
    }
    
    
    public static String GetFileName(String dir) {
    	String[] dirArray = dir.split("/");
    	int dirLength = dirArray.length;
    	String currName;
    	if(dirLength>0) {
    		currName = dirArray[dirArray.length -1];
    		dirArray= currName.split(".txt");
    		currName = dirArray[0].trim();

    	}else {
    		currName= dir;
    		dirArray= currName.split(".txt");
    		currName = dirArray[0].trim();
    	}
    	return currName;
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
    
    public static void ListObjectPrinter(ListObject listobj, String filename) {
    	ArrayList<String> list = listobj.GetList();
    	 BufferedWriter writer = null;
    	 try{
    	      File fout = new File("output/"+filename);
    	      FileOutputStream fos = new FileOutputStream(fout);

    	      writer = new BufferedWriter(new OutputStreamWriter(fos));

    	      for (String text : list) {
    	    	  writer.write(text);
    	    	  writer.newLine();
    	      }

    	    }catch (Exception  e){
    	    	e.printStackTrace();        
    	    }finally{
    	    	try {
    			    if (writer != null)
    			    	writer.close();
    			   } catch (Exception ex) {
    			    ex.printStackTrace();
    			   }
    	    }
    }
    
    
}
