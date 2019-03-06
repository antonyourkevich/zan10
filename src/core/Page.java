package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Page {

	
	 
	
	private LinkedList<Field> linkedList;
	private HashSet<Label> hashSet;
	private HashMap<String, String> hashMap;
		float id;
	String title;
	
	
	public Page(float id, String title)
	{
		this.id= id;
		this.title= title;
		this.linkedList= linkedList;
		this.hashSet= hashSet;
		this.hashMap= hashMap;
		
	}


	@Override
	public String toString() {
		return "Page [linkedList=" + linkedList + ", hashSet=" + hashSet + ", hashMap=" + hashMap + ", id=" + id
				+ ", title=" + title + "]";
	}


	
	
	
	
	
}
