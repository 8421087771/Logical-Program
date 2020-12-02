package com.app.sort;

import java.util.Comparator;
///Custom Sorting Program
 class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
         /*
		if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return +1;

		} else {
			return 0;
		}
		 */	
		return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0;

	}

}
