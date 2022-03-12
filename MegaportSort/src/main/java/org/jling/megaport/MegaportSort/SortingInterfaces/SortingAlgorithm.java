package org.jling.megaport.MegaportSort.SortingInterfaces;

import java.util.ArrayList;

import org.jling.megaport.MegaportSort.ListObject;

public interface SortingAlgorithm {
	
	
	public default ListObject Sort(ListObject list){
		return list;
	}
	
	
	public default double GetTimeTaken(ArrayList<String> list) {
		double ttaken =0.0;
		return ttaken;
	}
	
}
