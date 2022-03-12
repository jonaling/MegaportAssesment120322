package org.jling.megaport.MegaportSort.SortingInterfaces;

public class SortingFactory {
	public SortingAlgorithm CreateSortAlgorithm(String chosen) {
		if(chosen.toLowerCase().equals("quicksort")) {
			return new QuickSort();
		}else {
			return new CollectionsSort();
		}
		
	}
}
