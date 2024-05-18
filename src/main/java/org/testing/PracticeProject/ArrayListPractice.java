package org.testing.PracticeProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add("Soumya");
	a1.add("Sahu");
	a1.add(23);
	
	Iterator i1 = a1.iterator();
	
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
}
}
