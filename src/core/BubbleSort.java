package core;

import java.util.ArrayList;

public class BubbleSort {
	
	public static void main(String[] args)
	{
		
	}

	public void bubblesort (ArrayList<Integer>  c,int n )
	{
	for (int i=0;i<n-1;i++){
	  for(int j =0;j<n-1;j++)
	  if (c.get(j)>c.get(j+1)){
	       c.set(j+1, c.get(j+1)+c.get(j));
	       c.set(j, c.get(j+1)-c.get(j));
	 c.set(j+1, c.get(j+1)-c.get(j));
	}}
	 
	}
}

