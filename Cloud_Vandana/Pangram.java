package com.palle;

import java.util.TreeSet;

public class Pangram {

	public static void main(String[] args) 
	{
		  TreeSet<Character>s = new TreeSet<>();
		  for(char c='a';c<='z';c++)
		  {
			  s.add(c);
		  }
		  String p="The quick brown fox jumps over the lazy dog";
		  for(int i=0;i<p.length();i++)
		  {
			 char l = Character.toLowerCase(p.charAt(i));
			 if(s.contains(l))
			 {
				 s.remove(p.charAt(i));
			 }
			  
		  }
		  if(s.size()==0)
			  System.out.println("Pangram");
		  else
			  System.out.println("Not Pangram");


	}

}
