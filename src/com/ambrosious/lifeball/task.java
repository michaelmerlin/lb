package com.ambrosious.lifeball;

public class task
{
	private int[] modis = new int[2];
	boolean cmp;
	
	public task (String name, int multiplier, int baseVal, boolean complete)
	{
		String taskName = name;
		modis[0] = baseVal;
		modis[1] = multiplier;
		
	}
	public int points()
	{
		int pts = modis[0] * modis[1];
		if (cmp == true){return(pts);}
		else{return(-pts);}
	}
}
