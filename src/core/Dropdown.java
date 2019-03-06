package core;

import java.awt.List;
import java.util.ArrayList;

public class Dropdown {
	
	
	public ArrayList<String> options;
	boolean isSelected;
	String name;
	
	
	 
	 
	 
	 public Dropdown(Boolean isSelected, String name )
	 {
		 this.isSelected= isSelected;
		 this.name= name;
		 this.options= options;
	 }





	@Override
	public String toString() {
		return "Dropdown [options=" + options + ", isSelected=" + isSelected + ", name=" + name + "]";
	}



	
	 
	 
	 
	 

}
