package org.jling.megaport.MegaportSort;

import java.util.ArrayList;

public class ListObject {
	
	ArrayList<String> list;
	int linecount;
	
	public ListObject () {
		this.list=new ArrayList<String>();
		this.linecount = 0;
	}
	
	public void Add(String item) {
		list.add(item);
		this.linecount++;
	}
	
	public void setList(ArrayList<String> list) {
		this.list= list;
		this.linecount = list.size();
		
	}
	
	public ArrayList<String> GetList() {
		return list;
	}
	
	public int GetLength() {
		return linecount;
	}
	
	public String toString() {
		return list.toString();
	}
	
}
