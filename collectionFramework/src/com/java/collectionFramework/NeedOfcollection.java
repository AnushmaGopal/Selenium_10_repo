package com.java.collectionFramework;

public class NeedOfcollection {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 10;
		int f = 30;
		int g = 30;
		int h = 40;
		//to overcome this prob we'll use array
		int[] ar1 = new int[8]; //we can store 8 integer variables inside this array 'ar1'
		//array is index collections which holds homogeneous data elements
		
		//disadvantage of an array
		//1. ARRAYS ARE FIXED IN SIZE---once we created the array with size '8',the array length we can't change
		//2.  arrays can hold only homogeneous data or elements
		
		Student[] students = new Student[10]; //array is an object in java, & we can use 'new' keyword to create object of an array
		students[0]= new Student();
		students[1]= new Student();
//		students[2]= new Book(); ---This line will give compile time error becoz array can't hold heterogeneous elements
		
		Object[] objects = new Object[5];
		objects[0]= new Student();
		objects[1]= new Student();
		objects[2]= new Book(); //but array of objects can hold heterogeneous data..Object class is the supermost class in java
		
		//3.ready made support or methods is not available in array,so we've to explicitly write the logic in array
	}
//to overcome all these 3 limitations we've collections framework, introduced in jdk 1.2 release
	//hence we need collections framework
	
}
class Student{
	
}
class Book{
	
}