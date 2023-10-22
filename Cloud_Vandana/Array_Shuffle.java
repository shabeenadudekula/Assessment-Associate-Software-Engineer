package com.palle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Shuffle {

	public static void main(String[] args) 
	{
		     
		Integer a[]= {1,2,3,4,5,6};
		List<Integer>l=Arrays.asList(a);
		Collections.shuffle(l);
		l.toArray(a);
		System.out.println(Arrays.toString(a));
		

	}

}
