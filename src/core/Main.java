package core;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class Main {

	private static Label Label;

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		Dropdown dropdown1 = new Dropdown(true, "Yes");
		list.add("dropdown1");
		list.remove(dropdown1);
		list.set(0, "anything");
		for(String dropdown: list)
		{
			System.out.println(dropdown1);
		}
		
		
		
		
		
		
		
		
		ArrayList<Button> arrayList = new ArrayList<Button>();
		Page page= new Page(2, "Start page");
		ArrayList arrayList1= new ArrayList();
		arrayList.addAll(arrayList);
		list.set(0, "something");
		for(Button button: arrayList)
		{
			System.out.println(arrayList1);
		}
		
		
		
		
		Page page1= new Page(2, "HelloWorld");
		LinkedList<Field> linkedList1 = new LinkedList<Field>();
		linkedList1.addAll(linkedList1);
		list.set(0, "nothing");
		for(Field field: linkedList1)
		{
			System.out.println(linkedList1);
		}
		
		
		
		

		Page page2= new Page(4, "Belarus");
		HashSet<Label> hashSet = new HashSet<Label>();
		hashSet.addAll(hashSet);
		list.set(0, "no one");
		for(Label label: hashSet)
		{
			System.out.println(hashSet);
		}
		
		
		
		Page page3= new Page(5, "Russia");
		HashMap<Label,String> hashMap = new HashMap<Label, String>();
		
		
		
		hashMap.put(Label, "первый ");
		list.set(0, "no one");
		String first = hashMap.get(0);
		System.out.println(first);
		
		
		Iterator<Entry<core.Label, String>> it = hashMap.entrySet().iterator();
		
		while (it.hasNext()) {
			HashMap.Entry pair = (HashMap.Entry)it.next();
	        System.out.println(hashMap);
	        it.remove(); // avoids a ConcurrentModificationException
	    }
		
		
	
		
		
	}

}
