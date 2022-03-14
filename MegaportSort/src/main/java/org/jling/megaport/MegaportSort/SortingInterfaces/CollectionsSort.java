package org.jling.megaport.MegaportSort.SortingInterfaces;

import java.util.ArrayList;
import java.util.Collections;

import org.jling.megaport.MegaportSort.ListObject;

public class CollectionsSort implements SortingAlgorithm {
	
	@Override
	public ListObject Sort(ListObject list){
		System.out.println("collection sort has been run.");
		ArrayList<String> arrlist = list.GetList();
		Collections.sort(arrlist,String.CASE_INSENSITIVE_ORDER);
		list.SetList(arrlist);
		return list;
	}
}
