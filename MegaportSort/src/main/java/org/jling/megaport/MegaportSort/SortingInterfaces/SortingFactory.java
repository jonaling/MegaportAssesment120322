package org.jling.megaport.MegaportSort.SortingInterfaces;

public class SortingFactory {
	public SortingAlgorithm CreateSortAlgorithm(String chosen) {
		if(chosen.toLowerCase().equals("quicksort")) {
			return new QuickSort();
		}else if(chosen.toLowerCase().equals("heapsort")) {
			return new HeapSort();
		}else  {
			return new CollectionsSort();
		}
		
	}
}
