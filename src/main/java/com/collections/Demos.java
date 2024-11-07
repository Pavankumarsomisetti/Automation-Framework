package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Demos {

	public static void main(String[] args) {
		ArrayList x = new ArrayList<>();
		x.add(1);
		x.add(4);
		x.add(3);
		ArrayList<String>y = new ArrayList<>();
		y.add("a");
		y.add("B");
		y.add("C");
		x.addAll(y);
		System.out.println(x);
		Iterator a = x.iterator();
		while(a.hasNext()) {
			System.out.print(a.next());
		}
		Object[] r = x.toArray();
		for (Object object : r) {
			System.out.println();
			System.out.print(object);
			
		}
		
	}
}
