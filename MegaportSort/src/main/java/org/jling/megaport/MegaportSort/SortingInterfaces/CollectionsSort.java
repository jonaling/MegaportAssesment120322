package org.jling.megaport.MegaportSort.SortingInterfaces;

import java.util.ArrayList;
import java.util.Collections;

import org.jling.megaport.MegaportSort.ListObject;

public interface CollectionsSort extends SortingAlgorithm {
	
	@Override
	public default ListObject Sort(ListObject listobj){
		ArrayList<String> list = listobj.GetList();
		Collections.sort(list);
		listobj.setList(list);
		return listobj;
	}
}
