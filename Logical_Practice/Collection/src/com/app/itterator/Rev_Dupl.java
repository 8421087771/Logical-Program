package com.app.itterator;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Rev_Dupl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		
		HashSet<String> hs=new HashSet();
		hs.add("Jadu");
		hs.add("Padu");
		hs.add("Jadu");
		hs.add("Ramu");
		System.out.println(hs);
		List<String> ls=hs.stream().sorted((s1,s2)->s1.compareTo(s2))
				.collect(Collectors.toList());
		
		System.out.println(ls);
		
	}

}
