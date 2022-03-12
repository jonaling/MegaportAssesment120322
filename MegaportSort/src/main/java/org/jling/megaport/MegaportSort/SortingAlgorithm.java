package org.jling.megaport.MegaportSort;

import java.util.ArrayList;

public interface SortingAlgorithm {
	
	
	public default ListObject Sort(ListObject list){
		return list;
	}
	
	
	public default double GetTimeTaken(ArrayList<String> list) {
		double ttaken =0.0;
		return ttaken;
	}
	
}
