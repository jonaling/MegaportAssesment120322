package org.jling.megaport.MegaportSort.SortingInterfaces;

import org.jling.megaport.MegaportSort.ListObject;

public class HeapSort implements SortingAlgorithm{
	@Override
	public ListObject Sort(ListObject list) {
		System.out.println("heapsort has been run.");
		int length = list.GetLength();
		if(length == 0) {
			return list;
		}
		
		for (int i = length/2-1;i>=0;i--) {
			HeapSorter(list,length, i);
		}
		
		for(int j = length-1; j>=0;j--) {
			Swap(list,0,j);
			HeapSorter(list,j,0);
		}
		
		
		return list;
	}
	
	
	private void HeapSorter(ListObject list,int length, int i) {
		int left = 2*i+1;
		int right = 2*i+2;
		int highest= i;
		
		if(left< length && list.Get(left).compareToIgnoreCase(list.Get(highest))>0 ) {
			highest = left;	
		}
		
		if(right< length && list.Get(right).compareToIgnoreCase(list.Get(highest))>0 ) {
			highest =right;
		}
		
		if(highest != i) {
			Swap(list,i,highest);
			HeapSorter(list,length,highest);
		}
			
	}
	
	private void Swap(ListObject list,int i, int j) {
		String temp = list.Get(i);
		list.Set(i, list.Get(j));
		list.Set(j, temp);
	}
	
}
