package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(3);
		list.add(1); //list allows you to add duplicate values
		list.add(null); //list allows you to add null values
		//list follows insertion order
		System.out.println(list);
		
		//access elements from list
		System.out.println(list.get(0));
	}

}
