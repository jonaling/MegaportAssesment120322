package org.jling.megaport.MegaportSort;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;

import org.jling.megaport.MegaportSort.SortingInterfaces.CollectionsSort;
import org.jling.megaport.MegaportSort.SortingInterfaces.QuickSort;
import org.jling.megaport.MegaportSort.SortingInterfaces.SortingAlgorithm;
import org.jling.megaport.MegaportSort.SortingInterfaces.SortingFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


public class AppTest
{
	
	
	protected static SortingFactory factory;
	protected String[] args;
	protected ArrayList<String> list1;
	protected ArrayList<String> list2;
	protected ListObject listobj1;
	protected SortingAlgorithm sorter;
	
	@BeforeAll
	static void Setup() {

		factory = new SortingFactory();
		
	}
	
	
	
    @Test
    public void TestListObjectGet() {
    	String[] strArray = {"ABC","123"};
    	list1 = new ArrayList<String>(Arrays.asList(strArray));
    	listobj1 = new ListObject(list1);
    	
    	Assertions.assertEquals(listobj1.Get(0),"ABC");
    	Assertions.assertEquals(listobj1.Get(1),"123");
    }
    
    
    
    @Test
    public void TestListObjectSet() {
    	String[] strArray = {"ABC","123"};
    	list1 = new ArrayList<String>(Arrays.asList(strArray));
    	listobj1 = new ListObject(list1);
    	listobj1.Set(0, "Godrick");
    	Assertions.assertEquals(listobj1.Get(0),"Godrick");
    	Assertions.assertEquals(listobj1.Get(1),"123");
    }
    
    @Test
    public void TestListObjectAdd() {
    	String[] strArray = {"ABC","123"};
    	
    	listobj1 = new ListObject();
    	listobj1.Add("ABC");
    	listobj1.Add("123");
    	Assertions.assertEquals(listobj1.Get(0),"ABC");
    	Assertions.assertEquals(listobj1.Get(1),"123");
    }

    @Test
    public void TestListObjectGetLength() {
    	
    	
    	listobj1 = new ListObject();
    	listobj1.Add("ABC");
    	listobj1.Add("123");
    	Assertions.assertEquals(listobj1.GetLength(),2);
    	listobj1.Add("doreme");
    	Assertions.assertEquals(listobj1.GetLength(),3);
    }
	
    @Test
    public void TestListObjectGetList() {
    	String[] strArray = {"ABC","123"};
    	list1 = new ArrayList<String>(Arrays.asList(strArray));
    	listobj1 = new ListObject(list1);
    	ArrayList<String> list2= listobj1.GetList();
    	
    	Assertions.assertEquals(list2,list1);
   
    }
    
    @Test
    public void TestListObjectSetList() {
    	String[] strArray = {"ABC","123"};
    	list1 = new ArrayList<String>(Arrays.asList(strArray));
    	listobj1 = new ListObject();
    	listobj1.SetList(list1);
    	
    	Assertions.assertEquals(listobj1.Get(0),"ABC");
    	Assertions.assertEquals(listobj1.Get(1),"123");
   
    }
    
    @Test
	@Timeout(1)
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
		sorter = new CollectionsSort();
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
    
	
    //test response for demo file using collection sort
	@Test
	@Timeout(1)
    public void FactoryTestCollectionSortAlgo() {
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
		@Timeout(1)
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
			sorter = new QuickSort();
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
	@Timeout(1)
    public void FactoryTestQuickSortAlgo() {
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
  

  
}
