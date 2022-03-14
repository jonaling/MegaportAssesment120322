package org.jling.megaport.MegaportSort;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegrationTest {
	
	
	protected String[] args;
	
	protected static void DeleteDirectory(String filedir) {
		File dir = new File(filedir);
		File[] contents = dir.listFiles();
		for (File file : contents) {
			file.delete();
		}
	}
	
	@BeforeEach
	 void BeforeEachTests() {
		DeleteDirectory("./output");
		
	}
	
	@Test
    public void NoFileTest() {
    	args = new String[0];
    	App.main(args);
    	File file=new File("./output/DemoFile1-sorted.txt");
    	Assertions.assertTrue(!file.isDirectory() && file.getName().equalsIgnoreCase("DemoFile1-sorted.txt"));
    }
	
	@Test
    public void BlankTest() {
    	String[] args = {"src/test/resources/blanktest.txt"};
    	App.main(args);
    	File file1=new File("./output/blanktest-sorted.txt");
    	File file2 = new File("src/test/resources/blanktest-sorted.txt");
    	
    	Boolean result;
		try{
			result = FileUtils.contentEquals(file1,file2);
		}catch(Exception e){
			e.printStackTrace();
			result = false;
		}
		
		Assertions.assertTrue(result);
		}
	
	//test response for actual test file using collection sort
		@Test
	    public void TestFileCollectionSort() {
			String[] args = {"src/test/resources/test1.out"};
			App.main(args);
			File file1= new File("./output/test1-sorted.out");
			File file2 = new File("src/test/resources/test1-sorted.out");
			Boolean result;
			try{
				result = FileUtils.contentEquals(file1,file2);
			}catch(Exception e){
				e.printStackTrace();
				result = false;
			}
			
			Assertions.assertTrue(result);
	    }
	    
	    //test response for actual test file using quick-sort
		@Test
	    public void TestFileQuickSort() {
	    	String[] args = {"Quicksort","src/test/resources/test2.in"};
			App.main(args);
			File file1= new File("./output/test2-sorted.in");
			File file2 = new File("src/test/resources/test2-sorted.in");
			Boolean result;
			try{
				result = FileUtils.contentEquals(file1,file2);
			}catch(Exception e){
				e.printStackTrace();
				result = false;
			}
			
			Assertions.assertTrue(result);
	    }
		
		@Test
	    public void TestFileQuickSortMultiple() {
	    	String[] args = {"Quicksort","src/test/resources/test2.in","src/test/resources/test1.out"};
			App.main(args);
			File file1= new File("./output/test2-sorted.in");
			File file2 = new File("src/test/resources/test2-sorted.in");
			File file3= new File("./output/test1-sorted.out");
			File file4= new File("src/test/resources/test1-sorted.out");
			Boolean result;
			try{
				result = FileUtils.contentEquals(file1,file2 )&& FileUtils.contentEquals(file3, file4);
			}catch(Exception e){
				e.printStackTrace();
				result = false;
			}
			
			Assertions.assertTrue(result);
	    }
	
}
