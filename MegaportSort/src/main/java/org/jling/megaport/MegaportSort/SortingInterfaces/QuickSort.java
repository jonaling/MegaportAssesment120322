package org.jling.megaport.MegaportSort.SortingInterfaces;

import java.util.ArrayList;

import org.jling.megaport.MegaportSort.ListObject;

public class QuickSort implements SortingAlgorithm {
	

	@Override
	public ListObject Sort(ListObject list) {
		System.out.println("quicksort has been run.");
		int high = list.GetLength()-1;


		Quicksort(list,0,high);
		

		return list;
	}
	
	private void Quicksort(ListObject list,int low,int high) {
		if(low< high) {
			int pi = Partition(list,low,high);
			Quicksort(list, low, pi-1);
			Quicksort(list,pi+1,high);
		}
	}
	
	private int Partition(ListObject list, int low, int high) {
		String pivot = list.Get(high);
		
		 int bottom = (low - 1);
		
		for (int i = low; i< high;i++) {
			if(list.Get(i).compareToIgnoreCase(pivot) < 0) {
				bottom++;
				Swap(list,bottom,i);
				
			}
		}
		Swap(list,bottom+1,high);
		return (bottom +1);
	}
	
	private void Swap(ListObject list,int i, int j) {
		String temp = list.Get(i);
		list.Set(i, list.Get(j));
		list.Set(j, temp);
	}
	
	
	
	private void Quicksort(ArrayList<String> list,int low,int high) {
		if(low< high) {
			int pi = Partition(list,low,high);
			Quicksort(list, low, pi-1);
			Quicksort(list,pi+1,high);
		}
	}
	
	private int Partition(ArrayList<String> list, int low, int high) {
		String pivot = list.get(high);
		
		 int bottom = (low - 1);
		
		for (int i = low; i< high;i++) {
			if(list.get(i).compareToIgnoreCase(pivot) < 0) {
				bottom++;
				Swap(list,bottom,i);
				
			}
		}
		Swap(list,bottom+1,high);
		return (bottom +1);
	}
	
	private void Swap(ArrayList<String> list,int i, int j) {
		String temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

}
