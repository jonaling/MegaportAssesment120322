package org.jling.megaport.MegaportSort;

import java.util.ArrayList;

public abstract class SortingAlgorithm {
	private int lineCount;
	private double timeTaken;
	private ArrayList<String> list;
	
	public ArrayList<String> Sort(){
		return list;
	}
	
	public int GetLineCount() {
		return lineCount;
	}
	
	public double GetTimeTaken() {
		return timeTaken;
	}
	
}
