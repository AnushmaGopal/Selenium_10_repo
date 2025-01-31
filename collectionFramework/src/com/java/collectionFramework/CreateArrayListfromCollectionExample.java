package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CreateArrayListfromCollectionExample {

	public static void main(String[] args) {
		//create Arraylist object
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(29);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(13);
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);
	}

}
