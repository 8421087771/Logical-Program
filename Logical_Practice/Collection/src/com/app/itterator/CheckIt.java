 package com.app.itterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CheckIt {
   
	
	public static void main(String[] args) {
		
		ArrayList< Integer>  al= new ArrayList<>();
		for(int j=0; j<=10; j++) {
		    al.add(j);
		}
		  Iterator<Integer>  it= al.iterator();
		  while(it.hasNext()) {
			  Integer in=it.next();
			  if(in%2==0)
				  System.out.print(in);  
			  else 
				  it.remove();	
		  }
		
		
		
		
	}
	   
}
