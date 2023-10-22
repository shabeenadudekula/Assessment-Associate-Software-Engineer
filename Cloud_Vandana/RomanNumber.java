package com.palle;

import java.util.Arrays;

public class RomanNumber {

	public static void main(String[] args) 
	{
		 String s = "LXVMC";
		 String a[]=s.split("");
		 int b[]=new int[a.length];int sol=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i].equals("M"))
				 b[i]=1000;
			 else if(a[i].equals("D"))
				 b[i]=500;
			 else if(a[i].equals("C"))
				 b[i]=100;
			 if(a[i].equals("L"))
				 b[i]=50;
			 else if(a[i].equals("X"))
				 b[i]=10;
			 else if(a[i].equals("V"))
				 b[i]=5;
			 else if(a[i].equals("I"))
				 b[i]=1;
		 }
		 for(int i=0;i<b.length-1;i++)
		 {
			 if(b[i]>=b[i+1])
				 sol=sol+b[i];
			 else
				 sol=sol-b[i];
		 }
		 sol=sol+b[b.length-1];
		 System.out.println(sol);


	}

}
