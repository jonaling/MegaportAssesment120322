package org.jling.megaport.MegaportSort;

import java.util.ArrayList;

public class ListObject {
	
	ArrayList<String> list;
	int linecount;
	
	public ListObject () {
		this.list=new ArrayList<String>();
		this.linecount = 0;
	}
	
	public ListObject (ArrayList<String> list) {
		this.list=list;
		this.linecount = list.size();
	}
	
	public void Add(String item) {
		this.list.add(item);
		this.linecount++;
	}
	
	public void Set( int index,String item) {
		this.list.set(index,item);
	}
	
	public String Get(int index) {
		return this.list.get(index);
	}
	
	
	public void SetList(ArrayList<String> list) {
		this.list= list;
		this.linecount = list.size();
		
	}
	
	public ArrayList<String> GetList() {
		return list;
	}
	
	public int GetLength() {
		return linecount;
	}
	
	public String ToString() {
		return list.toString();
	}
	
}
