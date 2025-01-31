package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
	public static void main(String[] args) {

//		Collection<String> fruitCollection = new ArrayList<>();
//		fruitCollection.add("apple");
//		fruitCollection.add("apple");
//		fruitCollection.add("banana");
//		System.out.println(fruitCollection);
//		
//		fruitCollection.remove("banana");
//		System.out.println(fruitCollection);
//
//		System.out.println(fruitCollection.contains("apple"));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(60);
		list.add(20);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}
}
