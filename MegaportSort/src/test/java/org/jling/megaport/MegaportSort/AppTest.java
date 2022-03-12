package org.jling.megaport.MegaportSort;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;

import org.jling.megaport.MegaportSort.SortingInterfaces.SortingAlgorithm;
import org.jling.megaport.MegaportSort.SortingInterfaces.SortingFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AppTest
{
	protected static void DeleteDirectory(String filedir) {
		File dir = new File(filedir);
		File[] contents = dir.listFiles();
		for (File file : contents) {
			file.delete();
		}
	}
	
	protected SortingFactory factory;
	protected String[] args;
	protected ArrayList<String> list1;
	protected ArrayList<String> list2;
	protected ListObject listobj1;
	protected SortingAlgorithm sorter;
	
	@BeforeEach
	 void BeforeEachTests() {
		DeleteDirectory("./output");
		factory = new SortingFactory();
	}
	
	
    
	@Test
    public void NoFileTest() {
    	args = new String[0];
    	App.main(args);
    	File file=new File("./output/DemoFile1-sorted.txt");
    	Assertions.assertTrue(!file.isDirectory() && file.getName().equalsIgnoreCase("DemoFile1-sorted.txt"));
    }

    //test response for demo file using collection sort
	@Test
    public void TestCollectionSortAlgo() {
		String[] strArray ={"Batman"
				,"Spiderman"
				,"Peter Parker"
				,"Bruce Wayne"
				, "1324"
				, ".net"
				, "c#"
				,"java"};
		list1 =  new ArrayList<String>(Arrays.asList(strArray));
		listobj1 = new ListObject(list1);
		sorter = factory.CreateSortAlgorithm("");
		listobj1 =sorter.Sort(listobj1);
		list1=listobj1.GetList();
		String[] resultArray ={".net"
				,"1324"
				,"Batman"
				,"Bruce Wayne"
				,"c#"
				,"java"
				,"Peter Parker"
				,"Spiderman"};
		list2= new ArrayList<String> (Arrays.asList(resultArray));
		Assertions.assertEquals(list2,list1);
    	
    }
    
    //test response for demo file using quick-sort
	@Test
    public void TestQuickSortAlgo() {
		String[] strArray ={"Batman"
				,"Spiderman"
				,"Peter Parker"
				,"Bruce Wayne"
				, "1324"
				, ".net"
				, "c#"
				,"java"};
		list1 =  new ArrayList<String>(Arrays.asList(strArray));
		listobj1 = new ListObject(list1);
		sorter = factory.CreateSortAlgorithm("quicksort");
		 listobj1 =sorter.Sort(listobj1);
		list1=listobj1.GetList();
		String[] resultArray ={".net"
				,"1324"
				,"Batman"
				,"Bruce Wayne"
				,"c#"
				,"java"
				,"Peter Parker"
				,"Spiderman"};
		list2= new ArrayList<String> (Arrays.asList(resultArray));
		Assertions.assertEquals(list2,list1);
    	
    }
    
    //test response for actual test file using collection sort
    public void TestFileCollectionSort() {
    	
    }
    
    //test response for actual test file using quick-sort
    public void TestFileQuickSort() {
    	
    }
    
    //test for file with no output
    public void TestEmptyFile() {
    	
    }
    
  

  
}
