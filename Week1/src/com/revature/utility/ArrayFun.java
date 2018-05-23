package com.revature.utility;

import java.util.Arrays;
//var args: 1 to many, var args has to be the last in parameter list
//public statis String format(String pattern, Object... arguments);

public class ArrayFun {
	
	public static void main(String[] args) 
	{
	
		int [] arry = new int[3];
		int [] arry2 = {1,2,3,4,5,6,7,8,9,10};
		
		arry2[7] = 5;
		
		/*
		for(int i = 0; i < arry2.length; i++) 
		{
			System.out.print(i+" ");
		}
		
		//System.out.println(arry2.toString());
		System.out.println(arry2.length);
		*/
		
		printMe(arry2);
		printMeGooder(arry2);
		
	
	}
	
	static void printMe(int[] a) 
	{
		for(int i =0; i<a.length; i++) 
		{
			System.out.println(i);
		}
		System.out.println("That's the end!");
	}
	
	static void printMeGooder(int[] b) 
	{
		for(int i : b) 
		{
			System.out.println(i);
		}
	}

}
