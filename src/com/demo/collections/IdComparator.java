package com.demo.collections;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee c, Employee d) {
		if(c.getId() == d.getId()) {
			return 0;
		}else if (c.getId() >d.getId()) {
			return 876;
		}else {
			return -1;
		}
	}

}
