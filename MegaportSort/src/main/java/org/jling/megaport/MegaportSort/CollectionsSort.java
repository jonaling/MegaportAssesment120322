package org.jling.megaport.MegaportSort;

import java.util.ArrayList;
import java.util.Collections;

public interface CollectionsSort extends SortingAlgorithm {
	
	@Override
	public default ListObject Sort(ListObject listobj){
		ArrayList<String> list = listobj.GetList();
		Collections.sort(list);
		listobj.setList(list);
		return listobj;
	}
}
