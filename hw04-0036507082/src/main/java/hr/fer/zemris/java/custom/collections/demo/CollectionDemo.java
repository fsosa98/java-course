package hr.fer.zemris.java.custom.collections.demo;

import hr.fer.zemris.java.custom.collections.ArrayIndexedCollection;
import hr.fer.zemris.java.custom.collections.Collection;
import hr.fer.zemris.java.custom.collections.LinkedListIndexedCollection;
import hr.fer.zemris.java.custom.collections.List;

/**
 * Class CollectionDemo for testing purpose.
 *
 * @author Filip
 */
public class CollectionDemo {

	/**
	 * This is main method.
	 * 
	 * @param args ignored
	 */
	public static void main(String[] args) {
		List<String> col1 = new ArrayIndexedCollection<>();
		List<String> col2 = new LinkedListIndexedCollection<>();
		col1.add("Ivana");
		col2.add("Jasna");
		Collection<String> col3 = col1;
		Collection<String> col4 = col2;
		col1.get(0);
		col2.get(0);
//		col3.get(0); // neće se prevesti! Razumijete li zašto?
//		col4.get(0); // neće se prevesti! Razumijete li zašto?
		col1.forEach(System.out::println); // Ivana
		col2.forEach(System.out::println); // Jasna
		col3.forEach(System.out::println); // Ivana
		col4.forEach(System.out::println); // Jasna
	}
	
}
